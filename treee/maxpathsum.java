
public class maxpathsum {
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

    static int max = Integer.MIN_VALUE;

    static int maxPathSum(Node root) {
        if (root == null)
            return 0;

        sum(root);
        return max;
    }

    static int sum(Node root) {
        if (root == null)
            return 0;

        int left = Math.max(0, sum(root.left));
        int right = Math.max(0, sum(root.right));

        max = Math.max(max, left + right + root.data);
        return root.data + Math.max(left, right);

    }

    public static void main(String[] args) {

        Node root = new Node(-10);

        root.left = new Node(9);

        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println("The maximum path sum is: " + maxPathSum(root));
    }
}
