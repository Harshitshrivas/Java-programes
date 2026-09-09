
import java.util.ArrayList;

public class bstiterator {
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

    static ArrayList<Integer> list = new ArrayList<>();
    int index = 0;

    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public bstiterator(Node root) {

        inorder(root);
    }

    public int next() {

        return list.get(index++);
    }

    public boolean hasNext() {
        return index != list.size();
    }

    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(15);
        root.right.left = new Node(9);
        root.right.right = new Node(20);

        bstiterator iterator = new bstiterator(root);
        System.out.println("The next element is: " + iterator.next());
        System.out.println("The next element is: " + iterator.next());
        System.out.println("Has next element: " + iterator.hasNext());
        System.out.println("The next element is: " + iterator.next());
        System.out.println("Has next element: " + iterator.hasNext());
        System.out.println("The next element is: " + iterator.next());
        System.out.println("Has next element: " + iterator.next());
        System.out.println("Has next element: " + iterator.hasNext());

    }
}
