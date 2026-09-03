public class LCA {
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

    static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (root == null) {
            return root;
        }
        if (root.data == p.data || root.data == q.data) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node p = root.left.left; // Node with value 4
        Node q = root.left.right; // Node with value 5
        Node lca = lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor: " + lca.data);
    }
}
