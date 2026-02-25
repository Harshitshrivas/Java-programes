public class insertdll {

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

    public void insertatend(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
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

        insertdll list = new insertdll();

        list.insertbegin(8);
        list.insertbegin(6);
        list.insertbegin(4);
        list.insertbegin(2);

        System.out.println("Doubly Linked List after inserting at the beginning:");
        list.printlist();

        list.insertatend(10);
        list.insertatend(12);
        System.out.println("Doubly Linked List after inserting at the end:");
        list.printlist();

    }
}
