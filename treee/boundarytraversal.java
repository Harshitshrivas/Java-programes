
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boundarytraversal {

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

    static boolean isLeaf(Node root) {
        return root.left == null && root.right == null; // Check whether node is a leaf
    }

    static void leftBoundary(Node root, List<Integer> ans) {

        Node curr = root.left;

        while (curr != null) {

            if (!isLeaf(curr)) { // Leaf node ko left boundary me add nahi karna
                ans.add(curr.data);
            }

            // prefer left
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    static void addLeaves(Node root, List<Integer> ans) {
        if (root == null)
            return;

        if (isLeaf(root)) { // Agar leaf hai to add karo
            ans.add(root.data);
        }

        addLeaves(root.left, ans);
        addLeaves(root.right, ans);
    }

    static void rightBoundary(Node root, List<Integer> ans) {

        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();

        while (curr != null) {

            if (!isLeaf(curr)) { // Leaf node ko right boundary me add nahi karna
                temp.add(curr.data);
            }

            // prefer right
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        Collections.reverse(temp); // Right boundary ko bottom-to-top add karna hai
        ans.addAll(temp);
    }

    static List<Integer> boundaryTraversal(Node root) {

        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        if (!isLeaf(root)) { // Agar root khud leaf hai
            ans.add(root.data);
        }
        // 1 Left Boundary
        leftBoundary(root, ans);

        // 2 Leaf Node
        addLeaves(root, ans);

        // 3 Right Boundary
        rightBoundary(root, ans);
        return ans;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(3);

        root.left.left.right = new Node(4);

        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);

        root.right.right = new Node(8);

        root.right.right.left = new Node(9);

        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        List<Integer> result = boundaryTraversal(root);
        System.out.println(result);

    }
}
