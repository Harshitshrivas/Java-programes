
import java.util.*;

public class bottomview {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        Node node;
        int line;

        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    static void bottomView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Pair> que = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        que.add(new Pair(root, 0));

        while (!que.isEmpty()) {
            Pair p = que.poll();
            Node node = p.node;
            int line = p.line;

            map.put(line, node.data);

            if (node.left != null) {
                que.add(new Pair(node.left, line - 1));
            }
            if (node.right != null) {
                que.add(new Pair(node.right, line + 1));
            }
        }
        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Bottom view of the binary tree is: ");
        bottomView(root);
    }
}
