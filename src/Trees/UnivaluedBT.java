package Trees;
//https://leetcode.com/problems/univalued-binary-tree/
public class UnivaluedBT {
    public boolean isUnivalTree(TreeNode root) {
        return isSame(root,root.val);
    }
    private boolean isSame(TreeNode root, int currentVal) {

        if(root == null) return true;

        if(root.val != currentVal) return false;

        boolean la = isSame(root.left,currentVal);
        boolean ra = isSame(root.right,currentVal);

        return la && ra;
    }
}
