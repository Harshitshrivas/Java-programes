import java.util.*;

public class max_widhth2 {

    public static class Node {
        Node left;
        Node right;

        Node(int data) {

            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        Node node;
        int index;

        Pair(Node node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    static int maxWidhth2(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Pair> que = new LinkedList<>();
        int maxwidth = 0;
        que.offer(new Pair(root, 0));

        while (!que.isEmpty()) {
            int levelsize = que.size();

            int levelstart = que.peek().index;
            int index = 0;

            for (int i = 0; i < levelsize; i++) {
                Pair p = que.poll();
                Node node = p.node;
                index = p.index;

                if (node.left != null) {
                    que.offer(new Pair(node.left, 2 * index));
                }
                if (node.right != null) {
                    que.offer(new Pair(node.right, 2 * index + 1));
                }
            }
            int width = index - levelstart + 1;
            maxwidth = Math.max(maxwidth, width);
        }
        return maxwidth;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(3);
        root.right = new Node(2);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.right = new Node(9);
        System.out.println("Maximum Width: " + maxWidhth2(root));
    }
}
