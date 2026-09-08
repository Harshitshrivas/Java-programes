import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class deletebst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static Node deleteBST(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteBST(root.left, key);
        } else if (key > root.data) {
            root.right = deleteBST(root.right, key);
        } else {
            // Case 1: Leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
                // Case 3: Only left child
            } else if (root.right == null) {
                return root.left;
            } else {

                Node succesor = findmin(root.right);
                root.data = succesor.data;
                root.right = deleteBST(root.right, succesor.data);
            }
        }
        return root;
    }

    static Node findmin(Node root) {

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Level Order Traversal
    static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList<String> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                ans.add("null");
                continue;
            }
            ans.add(String.valueOf(curr.data));
            q.add(curr.left);
            q.add(curr.right);
        }
        // Extra nulls at the end remove karna
        while (ans.get(ans.size() - 1).equals("null")) {
            ans.remove(ans.size() - 1);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(6);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.right = new Node(7);

        int key = 3;

        System.out.print("Level Order Traversal before deletion: ");
        printLevelOrder(root);

        root = deleteBST(root, key);

        System.out.print("Level Order Traversal after deletion: ");
        printLevelOrder(root);
    }
}
