import java.util.*;

public class builtree_inor_post {
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

    static int index = 0;

    static Node buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1, map);
    }

    static Node helper(int[] preorder, int start, int end, HashMap<Integer, Integer> map) {

        if (start > end) {
            return null; 
        }
        int rootval = preorder[index++];
        Node node = new Node(rootval);
        int inorderindex = map.get(rootval);

        node.left = helper(preorder, start, inorderindex - 1, map);
        node.right = helper(preorder, inorderindex + 1, end, map);

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
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };
        Node root = buildTree(preorder, inorder);
        System.out.println("Tree constructed successfully.");
        System.out.println("Root: " + root.data);
        levelOrder(root);

    }
}
