public class findpairDll {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertbegin(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void findpair(int key) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node left = head;
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        while (left != null && right != null && left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == key) {
                System.out.println("Pair found: (" + left.data + ", " + right.data + ")");
                left = left.next;
                right = right.prev;
            }

            if (sum < key) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
    }

    public void printlist() {

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        findpairDll list = new findpairDll();

        list.insertbegin(6);
        list.insertbegin(5);
        list.insertbegin(4);
        list.insertbegin(3);
        list.insertbegin(2);
        list.insertbegin(1);

        System.out.println("Original list:");
        list.printlist();

        int key = 7;
        System.out.println("Pairs with sum " + key + ":");
        list.findpair(key);
        System.out.println("Pairs with sum 10 : ");
        list.findpair(10);

    }
}
