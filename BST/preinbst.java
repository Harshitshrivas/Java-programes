import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class preinbst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static Node preOrder(int[] preorder) {
        Node root = null;
        for (int i = 0; i < preorder.length; i++) {
            root = insertt(root, preorder[i]);
        }
        return root;
    }

    static Node insertt(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insertt(root.left, val);
        } else if (val > root.data) {
            root.right = insertt(root.right, val);
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

        int[] preorder = { 8, 5, 1, 7, 10, 12 };
        Node root = preOrder(preorder);
        printLevelOrder(root);

    }
}
