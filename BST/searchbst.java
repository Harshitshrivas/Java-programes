import java.util.*;

public class searchbst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static Node search(Node root, int val) {
            if (root == null) {
                return null;
            }
            if (root.data == val) {
                return root;
            }
            if (val < root.data) {
                return search(root.left, val);
            }
            return search(root.right, val);
        }

        static void preorder(Node root, List<Integer> ans) {
            if (root == null) {
                return;
            }
            ans.add(root.data);
            preorder(root.left, ans);
            preorder(root.right, ans);

        }

        public static void main(String[] args) {
            Node root = new Node(50);

            root.left = new Node(30);
            root.right = new Node(70);

            root.left.left = new Node(20);
            root.left.right = new Node(40);

            root.right.left = new Node(60);
            root.right.right = new Node(80);

            int val = 70;
            Node result = search(root, val);

            if (result != null) {
                System.out.println("Value " + val + " found in the BST.");

                // Store preorder
                List<Integer> preorderList = new ArrayList<>();

                // Preorder of searched subtree
                preorder(result, preorderList);
                System.out.println("Preorder of searched subtree: " + preorderList);

            } else {

                System.out.println("Value " + val + " not found in the BST.");

            }
        }
    }
}
