public class middle {
    Node head;

    public class Node {
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

    public Node middNode() {

        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        middle list = new middle();
        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);

        System.out.println("Original list:");
        list.printList();

        System.out.println("Middle node: " + list.middNode().data);
        
    }
}
