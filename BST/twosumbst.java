
import java.util.HashSet;

public class twosumbst {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static boolean findTarget(Node root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return solve(root, k, set);
    }

    static boolean solve(Node root, int k, HashSet<Integer> set) {

        if (root == null) {
            return false;
        }

        if (set.contains(k - root.data)) {
            return true;
        }
        set.add(root.data);

        return solve(root.left, k, set) || solve(root.right, k, set);
    }

    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(6);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.right = new Node(7);

        int k = 9;

        System.out.println(findTarget(root, k));
    }
}
