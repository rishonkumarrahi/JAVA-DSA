package Trees;
import java.util.*;
//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class PostOrderBST {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>answer = new ArrayList<>();
        postOrder(root,answer);
        return answer;
    }

    private void postOrder(TreeNode root, List<Integer> answer) {
        if(root == null) return;

        postOrder(root.left,answer);
        postOrder(root.right,answer);
        answer.add(root.val);

        return;
    }
}
