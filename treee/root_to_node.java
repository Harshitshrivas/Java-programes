import java.util.*;

public class root_to_node {
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

    static boolean getPath(Node root, int target, List<Integer> path) {

        if (root == null) {
            return false;
        }

        path.add(root.data);

        if (root.data == target) {
            return true;
        }
        boolean left = getPath(root.left, target, path);
        boolean right = getPath(root.right, target, path); // like preorder traversal, we are traversing the tree and
                                                           // checking if the target node is present in the left or
                                                           // right subtree. If it is found, we return true and keep the
                                                           // path. If not, we backtrack by removing the last added node
                                                           // from the path and return false.

        if (left || right) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 5;
        List<Integer> path = new ArrayList<>();

        if (getPath(root, target, path)) {
            System.out.println("Path: " + path);
        } else {
            System.out.println("Node not found");
        }

    }
}
