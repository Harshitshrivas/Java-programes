
public class kth_smallele {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static int count, ans = 0;

    static int kthSmallest(Node root, int k) {
        inorder(root, k);
        return ans;
    }

    static void inorder(Node root, int k) {

        if (root == null || count >= k) {
            return;
        }

        inorder(root.left, k);
        count++;

        if (count == k) {
            ans = root.data;
        }

        inorder(root.right, k);

    }

    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(6);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.left.left.left = new Node(1);

        int k = 3;

        int result = kthSmallest(root, k);

        System.out.println("Kth Smallest Element: " + result);
    }
}
