package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class q11 {

    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();

        int max_left = 0, max_right = 0;
        int current_left = 0, current_right = 0;
        right.add(root.data);
        int nodes_in_current_level = 0;
        
        if (root.left != null) {
            qu.add(root.left);
            nodes_in_current_level++;
            current_left++;
        }
        if (root.right != null) {
            qu.add(root.right);
            nodes_in_current_level++;
            current_right++;
        }

        while (!qu.isEmpty()) {
            int nodes_in_next_level = 0;

            if (current_left > max_left) {
                left.add(qu.peek().data);
                if (qu.peek().left != null)
                    current_left = Math.max(current_left + 1, max_left);
            }

            while (nodes_in_current_level != 1) {
                Node current_node = qu.remove();
                if (current_node.left != null) {
                    qu.add(current_node.left);
                    nodes_in_next_level++;

                }
                if (current_node.right != null) {
                    qu.add(current_node.right);
                    nodes_in_next_level++;

                }
                nodes_in_current_level--;
            }
            Node temp = qu.remove();
            if (temp.left != null) {
                nodes_in_next_level++;

                qu.add(temp.left);
            }
            if (temp.right != null) {
                qu.add(temp.right);
                nodes_in_next_level++;

            }
            if (current_right > max_right) {
                right.add(temp.data);
                if (temp.right != null)
                    current_right = Math.max(current_right + 1, max_right);

            }
            nodes_in_current_level = nodes_in_next_level;

        }

        for (int i = left.size() - 1; i >= 0; i--)
            ans.add(left.get(i));
        for (int i = 0; i < right.size(); i++) {
            ans.add(right.get(i));
        }

        return ans;
    }
}
