import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class duplicate {
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

    static HashMap<String, Integer> map = new HashMap<>();
    static ArrayList<Node> ans = new ArrayList<>();

    public static List<Node> findDuplicateSubtrees(Node root) {
        traverse(root);
        return ans;
    }

    static String traverse(Node root) {
        if (root == null) {
            return "N";
        }

        String left = traverse(root.left);
        String right = traverse(root.right);

        String key = root.data + " , " + left + " , " + right;

        int count = map.getOrDefault(key, 0);

        if (count == 1) {
            ans.add(root);
        }

        map.put(key, count + 1);
        return key;
    }

    // Print subtree in preorder
    public static void printSubtree(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        printSubtree(root.left);
        printSubtree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.right.left = new Node(3);

        // Find duplicate subtrees
        List<Node> result = findDuplicateSubtrees(root);

        // Print result
        System.out.println("Duplicate Subtrees:");

        for (Node node : result) {
            System.out.print("[ ");
            printSubtree(node);
            System.out.println("]");
        }
    }
}
