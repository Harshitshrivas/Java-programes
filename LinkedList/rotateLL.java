public class rotateLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node rotateK(Node head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;
        Node tail = head;
        int length = 1;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        if (k % length == 0)
            return head;
        k = k % length;

        Node newNode = findkthNode(head, length - k);
        Node newhead = newNode.next;
        newNode.next = null;
        tail.next = head;
        return newhead;

    }

    public Node findkthNode(Node head, int k) {

        int count = 1;

        while (head != null) {
            if (count == k)
                return head;
            count++;
            head = head.next;
        }
        return head;
    }

    public static void printlist(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        rotateLL list = new rotateLL();
        System.out.println("Original list"); // reverse in k group
        printlist(head);

        head = list.rotateK(head, 2);
        System.out.println("rotated list");
        printlist(head);
    }
}
