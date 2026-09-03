import java.util.*;

public class max_widhth {
    public static class Node {
        Node left;
        Node right;

        Node(int data) {

            this.left = null;
            this.right = null;
        }
    }

    static int maxWidth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        int maxwidth = 0;

        while (!que.isEmpty()) {
            int levelsize = que.size();
            maxwidth = Math.max(maxwidth, levelsize);

            for (int i = 0; i < levelsize; i++) {
                Node node = que.poll();

                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                    que.add(node.right);
                }
            }
        }
        return maxwidth;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Maximum Width of the Binary Tree: " + maxWidth(root));
    }
}
