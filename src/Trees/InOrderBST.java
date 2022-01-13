package Trees;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class InOrderBST {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Inorder(root,answer);
        return answer;
    }

    private void Inorder(TreeNode root, List<Integer> answer) {
        if(root == null) return;

        Inorder(root.left , answer);
        answer.add(root.val);
        Inorder(root.right,answer);
        return;
    }
}
