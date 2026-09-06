public class floorr {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int floorr(Node root, int key) {

        int floorvalue = -1;

        while (root != null) {

            if (root.data == key) {
                return root.data;
            } else if (key < root.data) {
                root = root.left;
            } else {
                floorvalue = root.data;
                root = root.right;
            }
        }
        return floorvalue;
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.left = new Node(12);
        root.right.right = new Node(20);

        int key = 13;

        int result = floorr(root, key);

        System.out.println("The Floor of " + key + " = " + result);
    }
}
