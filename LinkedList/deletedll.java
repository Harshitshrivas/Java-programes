public class deletedll {

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

    public void deletebegin() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void deleteend() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.prev.next = null;
        currNode.prev = null;

    }

    public  void deleteatindex(int index){

        
    }

    public void printlist() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        deletedll dll = new deletedll();
        dll.insertbegin(8);
        dll.insertbegin(6);
        dll.insertbegin(4);
        dll.insertbegin(2);
        System.out.println("Original list:");
        dll.printlist();

        System.out.println("After deleting the first node:");
        dll.deletebegin();
        dll.printlist();
        System.out.println("After deleting the first node again:");
        dll.deletebegin();
        dll.printlist();
        System.out.println("After deleting the last node:");
        dll.deleteend();
        dll.printlist();

        dll.insertbegin(4);
        dll.insertbegin(2);
        System.out.println("Original list:");
        dll.printlist();
    }
}
