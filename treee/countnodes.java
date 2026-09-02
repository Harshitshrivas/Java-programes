import java.util.*;

public class countnodes {
    public static class Node {
        Node left;
        Node right;

        Node(int data) {
            this.left = null;
            this.right = null;
        }
    }

    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        // return countNodes(root.left) + countNodes(root.right) + 1; //1 . Recursive

        // Queue<Node> que = new LinkedList<>(); // 2. Level Order / BFS
        // que.offer(root);
        // int count = 0;
        // while (!que.isEmpty()) {
        // Node node = que.poll();
        // count++;
        // if (node.left != null) {
        // que.offer(node.left);
        // }
        // if (node.right != null) {
        // que.offer(node.right);
        // }
        // }
        // return count;

        Stack<Node> st = new Stack<>();  // 3. Iterative DFS
        st.push(root);

        int count = 0;

        while (!st.isEmpty()) {
            Node node = st.pop();
            count++;

            if (node.right != null)
                st.push(node.right);

            if (node.left != null)
                st.push(node.left);
        }

        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("The number of nodes in the tree is : " + countNodes(root));
    }
}
