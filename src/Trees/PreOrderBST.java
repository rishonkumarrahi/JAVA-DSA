package Trees;
//https://leetcode.com/problems/binary-tree-preorder-traversal/
import java.util.ArrayList;
import java.util.List;

public class PreOrderBST {

    public void preOrder(TreeNode root , List<Integer>answer) {
        if(root == null) return;

        //add the root
        answer.add(root.val);
        //left
        preOrder(root.left,answer);
        //right
        preOrder(root.right,answer);

        return;
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer>answer = new ArrayList<>();
        preOrder(root , answer);
        return answer;
    }
}
