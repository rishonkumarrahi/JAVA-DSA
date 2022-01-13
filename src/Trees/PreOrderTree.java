package Trees;

import java.util.*;

//https://leetcode.com/problems/n-ary-tree-preorder-traversal/
public class PreOrderTree {
    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        preOrder(root, answer);
        return answer;
    }

    private void preOrder(Node root, List<Integer> answer) {

        if (root == null) return;
        answer.add(root.val);
        //iterate the children
        for (Node child : root.children) {
            preOrder(child, answer);
        }
        return;
    }
}
