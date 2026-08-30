import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {

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

    public static List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();

        if(root == null){
            return ans;
        }
        que.offer(root);

        while (!que.isEmpty()) {
            int levelsize = que.size();
            List<Integer> res = new LinkedList<>();

            for (int i = 0; i < levelsize; i++) {
                Node node = que.poll();
                res.add(node.data);
                if (node.left != null)
                    que.add(node.left);
                if (node.right != null)
                    que.add(node.right);
            }
            ans.add(res);
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
        // Calling function
        List<List<Integer>> result = levelOrder(root);

        // Printing result
        System.out.println(result);
    }
}
