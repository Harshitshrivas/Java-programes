import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leftview {
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

    public static List<Integer> leftSideView(Node root) {

        Map<Integer, Integer> ans = new HashMap<>();
        leftView(root, ans, 0);
        return new ArrayList<>(ans.values());
    }

    static void leftView(Node root, Map<Integer, Integer> ans, int level) {
        if (root == null) {
            return;
        }
        ans.put(level, root.data);
        leftView(root.right, ans, level + 1);
        leftView(root.left, ans, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(leftSideView(root));
    }
}
