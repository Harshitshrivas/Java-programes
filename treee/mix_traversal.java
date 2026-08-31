
import java.util.*;

public class mix_traversal {

    static class Node {
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
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    static void allTraversals(Node root) {
        Stack<Pair> st = new Stack<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> postrder = new ArrayList<>();

        if (root == null)
            return;

        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair current = st.peek();

            switch (current.state) {
                case 1 -> {
                    preorder.add(current.node.data);
                    current.state++;
                    if (current.node.left != null) {
                        st.push(new Pair(current.node.left, 1));
                    }
                }
                case 2 -> {
                    inorder.add(current.node.data);
                    current.state++;
                    if (current.node.right != null) {
                        st.push(new Pair(current.node.right, 1));
                    }
                }
                default -> {
                    postrder.add(current.node.data);
                    st.pop();
                }
            }
        }
        System.out.println("Preorder  : " + preorder);
        System.out.println("Inorder   : " + inorder);
        System.out.println("Postorder : " + postrder);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        allTraversals(root);
    }
}
