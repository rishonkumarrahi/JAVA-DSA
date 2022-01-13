package Trees;

//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
public class SumRootToLeaf {
    public int sumRootToLeaf(TreeNode root) {
        int[] answer = new int[1];
        answer[0] = 0;
        rootToLeaf(root, "", answer);
        return answer[0];
    }

    private void rootToLeaf(TreeNode root, String currentString, int[] answer) {

        if (root.left == null && root.right == null) {
            currentString += String.valueOf(root.val);
            //string to decimal
            answer[0] += Integer.parseInt(currentString, 2);
            return;
        }
        if (root.left != null)
            rootToLeaf(root.left, currentString + String.valueOf(root.val), answer);
        if (root.right != null)
            rootToLeaf(root.right, currentString + String.valueOf(root.val), answer);
        return;
    }

    public int sumRootToLeafB(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }
    public int sumRootToLeaf(TreeNode root, int sum){
        if(root == null) return 0;
        sum = (2 * sum) + root.val;
        if(root.left == null && root.right == null) return sum;
        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
    }

}
