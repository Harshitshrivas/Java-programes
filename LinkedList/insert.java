public class insert {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    }

    public void addLast(int data) {
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
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insert list = new insert(); // creating an object of the insert class

        list.addfirst(10);
        list.addLast(20);
        list.addLast(30);

        list.addfirst(5);
        list.addfirst(1);

        System.out.println("Linked List:");
        list.printList();
    }
}
