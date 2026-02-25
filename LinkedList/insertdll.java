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

    public void insertatindex(int index, int data) { // method to insert a node at a specific index in the doubly linked list

        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        Node currNode = head;
        int count = 0;

        while (currNode != null && count < index - 1) {
            count++;
            currNode = currNode.next;
        }

        if (currNode == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = currNode.next; // update the next pointer of the new node to point to the next node of the current node
        newNode.prev = currNode;

        if (currNode.next != null) {  // check if the next node is not null before updating its prev pointer
            currNode.next.prev = newNode;
        }
        currNode.next = newNode;

    }

    public void printlist() {

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void printback() {
        Node cuNode = head;

        while (cuNode.next != null) { // Move to last node
            cuNode = cuNode.next;
        }

        while (cuNode != null) { // Traverse backword
            System.out.print(cuNode.data + " -> ");
            cuNode = cuNode.prev;
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

        list.insertatindex(2, 5);
        System.out.println("Doubly Linked List after inserting at index 2:");
        list.printlist();

        System.out.println("Doubly Linked List printed in reverse:");
        list.printback();

    }
}
