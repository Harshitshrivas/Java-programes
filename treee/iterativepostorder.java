import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativepostorder {

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

    static List<Integer> postOrder(Node root) {

        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);

            if (root.left != null)
                st1.push(root.left);
            if (root.right != null)
                st1.push(root.right);
        }
        while (!st2.isEmpty()) {
            ans.add(st2.pop().data);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(postOrder(root));
    }
}
