
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class tree_inorder_postorder {
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

    static int index;

    static Node builddTree(int[] postorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        index = postorder.length - 1;
        return helperr(postorder, 0, inorder.length - 1, map);
    }

    static Node helperr(int[] postorder, int left, int right, HashMap<Integer, Integer> map) {

        if (left > right)
            return null;

        int rootval = postorder[index--];
        Node node = new Node(rootval);
        int mid = map.get(rootval); // inorder mai key nikalne

        node.right = helperr(postorder, mid + 1, right, map);
        node.left = helperr(postorder, left, mid - 1, map);
        return node;
    }

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        System.out.print("[");
        boolean firstLevel = true; // Flag to check if it's the first level
        while (!queue.isEmpty()) {

            Node node = queue.poll();
            if (!firstLevel) {
                System.out.print(", ");
            }
            firstLevel = false; // After the first level, set the flag to false

            System.out.print(node.data);
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] postorder = { 9, 15, 7, 20, 3 };
        int[] inorder = { 9, 3, 15, 20, 7 };

        Node root = builddTree(postorder, inorder);
        System.out.println("Tree constructed successfully.");
        System.out.println("Root: " + root.data);
        levelOrder(root);
    }
}
