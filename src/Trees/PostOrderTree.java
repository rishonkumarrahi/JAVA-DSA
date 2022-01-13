package Trees;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal/
public class PostOrderTree {
    public List<Integer> postorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        postOrder(root, answer);
        return answer;
    }

    private void postOrder(Node root, List<Integer> answer) {
        if (root == null) return;

        //iterate the children
        for (Node child : root.children) {
            postOrder(child, answer);
        }
        answer.add(root.val);
        return;
    }
}

