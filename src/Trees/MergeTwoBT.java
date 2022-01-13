package Trees;

public class MergeTwoBT {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1,root2);
    }
    private TreeNode merge(TreeNode root1 , TreeNode root2) {
        //if both are null return null
        if(root1 == null && root2 == null) return null;
        //if any null return other node
        if(root1 == null) return root2;

        if(root2 == null) return root1;

        TreeNode newNode = new TreeNode(root1.val + root2.val);
        //once returning connect with newNode left and newNode right
        newNode.left =  merge(root1.left,root2.left);
        newNode.right = merge(root1.right,root2.right);

        return newNode;
    }
}
