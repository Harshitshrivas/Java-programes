
public class min_max {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static int findMin(Node root) {

            if (root == null) {
                return -1;
            }
            while (root.left != null) {
                root = root.left;
            }

            return root.data;
        }

        static int findMax(Node root) {

            if (root == null) {
                return -1;
            }

            while (root.right != null) {
                root = root.right;
            }
            return root.data;
        }

        public static void main(String[] args) {
            Node root = new Node(50);

            root.left = new Node(30);
            root.right = new Node(70);

            root.left.left = new Node(20);
            root.left.right = new Node(40);

            root.right.left = new Node(60);
            root.right.right = new Node(80);

            System.out.println("Minimum = " + findMin(root));
            System.out.println("Maximum = " + findMax(root));
        }
    }
}
