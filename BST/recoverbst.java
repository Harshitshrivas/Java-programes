
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class recoverbst {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void recoverTree(Node root) {

        ArrayList<Node> list = new ArrayList<>();
        inorder(root, list);
        Node first = null, second = null;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).data > list.get(i + 1).data) {
                if (first == null) {
                    first = list.get(i);
                }
                second = list.get(i + 1);
            }
        }
        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }

    static void inorder(Node root, ArrayList<Node> ans) {

        if (root == null) {
            return;
        }
        inorder(root.left, ans);
        ans.add(root);
        inorder(root.right, ans);
    }

    // Level Order Traversal
    static void printTree(Node root) {
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
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.right = new Node(2);

        System.out.print("Before Recovery: ");
        printTree(root);

        // Recover BST
        recoverTree(root);

        System.out.print("After Recovery: ");
        printTree(root);
    }
}
