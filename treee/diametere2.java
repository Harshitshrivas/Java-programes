public class diametere2 {
    static class Node {

        Node left;
        Node right;

        Node(int data) {
            this.left = null;
            this.right = null;
        }
    }

    static int diameter = 0;

    static int height(Node root) {
        if (root == null)
            return 0;

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        diameter = Math.max(diameter, leftheight + rightheight); // Diameter through current node
        return Math.max(leftheight, rightheight) + 1; // Height of current node
    }

    static int diameterOfBinaryTree(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Diameter of the binary tree is: " + diameterOfBinaryTree(root));
    }
}
