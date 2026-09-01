import java.util.*;

public class zigzag {
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

    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();

        if (root == null) {
            return ans;
        }
        que.offer(root);
        int flag = 0;

        while (!que.isEmpty()) {
            List<Integer> res = new LinkedList<>();
            int levelsize = que.size();

            for (int i = 0; i < levelsize; i++) {
                Node node = que.poll();
                res.add(node.data);

                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                    que.add(node.right);
                }
            }
            if (flag % 2 == 1) {
                Collections.reverse(res);
            }
            ans.add(res);
            flag++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> result = zigzagLevelOrder(root);

        // Printing result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
