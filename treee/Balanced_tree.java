public class Balanced_tree {

    static class Node {

        Node left;
        Node right;

        Node(int data) {
            this.left = null;
            this.right = null;
        }
    }

    static boolean balancedTree(Node root) {
        if (root == null)
            return true;

        return height(root) != -1;
    }

    static int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        if (left == -1 || right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(balancedTree(root));
    }
}
