public class LCABST {
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

    static Node lowestCommonAncestorr(Node root, Node p, Node q) {

        if (root == null) {
            return null;
        }
        if (p.data < root.data && q.data < root.data) {
            return lowestCommonAncestorr(root.left, p, q);
        }
        if (p.data > root.data && q.data > root.data) {
            return lowestCommonAncestorr(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(5);
        root.right.right = new Node(7);

        Node p = root.left.left; // 1
        Node q = root.left.right; // 3

        Node lca = lowestCommonAncestorr(root, p, q);
        System.out.println("Lowest Common Ancestor: " + lca.data);

    }
}
