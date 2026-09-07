public class succ_pred {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node findSuccessor(Node root, int val) {

        Node succesor = null;

        while (root != null) {

            if (root.data > val) {
                succesor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return succesor;
    }

    static Node findPredecessor(Node root, int val) {
        Node predd = null;

        while (root != null) {

            if (root.data < val) {
                predd = root;
                root = root.right; // iska matlab root dekh liya ab left mai ni jayga kyuki root sa chota too hoga
                                   // ni bada hi hoga
            } else {
                root = root.left;
            }
        }
        return predd;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        int val = 15;
        Node successor = findSuccessor(root, val);
        if (successor != null) {
            System.out.println("Successor of " + val + " is: " + successor.data);
        } else {
            System.out.println("No successor found for " + val);
        }

        Node predecessor = findPredecessor(root, val);
        if (predecessor != null) {
            System.out.println("Predecessor of " + val + " is: " + predecessor.data);
        } else {
            System.out.println("No predecessor found for " + val);
        }
    }
}
