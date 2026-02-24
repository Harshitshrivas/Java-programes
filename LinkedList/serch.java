public class serch {
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

    public boolean search(int key) { // method to search for a key in the linked list
        Node currNode = head;

        while (currNode != null) {
            if (currNode.data == key) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    public int searchindex(int key) { // method to search for a key in the linked list and return its index

        Node currNode = head;
        int index = 0;

        while (currNode != null) {
            if (currNode.data == key) {
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {

        serch list = new serch();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Linked List:");
        list.printList();

        int key = 30;
        System.out.println("Is " + key + " present in the linked list? " + list.search(key));
        System.out.println("Index of " + key + " in the linked list: " + list.searchindex(key));

        int keyNotFound = 60;
        System.out.println("Is " + keyNotFound + " present in the linked list? " + list.search(keyNotFound));
        System.out.println("Index of " + keyNotFound + " in the linked list: " + list.searchindex(keyNotFound));

    }
}
