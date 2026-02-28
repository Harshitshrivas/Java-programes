public class reverseLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertbegin(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void reverse() {
        Node prev = null;
        Node curNode = head;
        Node next;

        while (curNode != null) {
            next = curNode.next; // store the next node before changing the link
            curNode.next = prev; // reverse the link

            prev = curNode;
            curNode = next;
        }
        head = prev;
    }

    public void printlist() {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        reverseLL list = new reverseLL();
        list.insertbegin(8);
        list.insertbegin(7);
        list.insertbegin(6);
        list.insertbegin(5);
        list.insertbegin(4);
        list.insertbegin(3);
        list.insertbegin(2);
        list.insertbegin(1);
        System.out.println("Original list:");
        list.printlist();

        list.reverse();
        System.out.println("Reversed list:");
        list.printlist();
    }
}
