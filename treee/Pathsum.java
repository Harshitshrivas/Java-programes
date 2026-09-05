public class Pathsum {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static boolean hasPathSum(Node root, int targetSum) {

        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum - root.data == 0;
        }

        boolean left = hasPathSum(root.left, targetSum - root.data);
        boolean right = hasPathSum(root.right, targetSum - root.data);

        return left || right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int targetSum = 10;
        boolean result = hasPathSum(root, targetSum);
        System.out.println("Path with target sum " + targetSum + " exists: " + result);
    }
}
