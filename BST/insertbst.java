
import java.util.ArrayList;
import java.util.List;

public class insertbst {
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

    static Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        }
        if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void preorder(Node root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        ans.add(root.data);
        preorder(root.left, ans);
        preorder(root.right, ans);

    }

    public static void main(String[] args) {
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        int val = 80;
        root = insert(root, val);

        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        System.out.println("After inserting " + val + ":");
        System.out.println(ans);

    }
}
