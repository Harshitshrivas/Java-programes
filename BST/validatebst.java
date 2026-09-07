
public class validatebst {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static boolean isValidate(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean validate(Node root, long min, long max) {

        if (root == null) {
            return true;
        }
        if (root.data > min && root.data < max) {
            return validate(root.left, min, root.data) && validate(root.right, root.data, max);
        }

        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println("Tree is valid BST: " + isValidate(root));
    }

}