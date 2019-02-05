package coding.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    void reversePrint(Node node) {
        if (node == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        Stack<Node> s = new Stack<Node>();

        q.add(node);

        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node n = q.poll();
                s.push(n);
                // important
                if (n.right != null)
                    q.add(n.right);
                if (n.left != null)
                    q.add(n.left);

            }
        }

        while (!s.isEmpty()) {
            Node n = s.pop();
            System.out.print(n.data + " ");
        }
    }
}
