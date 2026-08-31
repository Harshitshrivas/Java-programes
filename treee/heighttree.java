public class heighttree {
    static class Node {

        Node left;
        Node right;

        Node(int data) {
            this.left = null;
            this.right = null;
        }
    }

    static int heightTree(Node node) {
        if (node == null)
            return 0;

        int left = heightTree(node.left);
        int right = heightTree(node.right);

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
        System.out.println("The Height of the tree is : " + heightTree(root));
    }
}
