public class sort_0_1_2 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sort012(Node head) {

        Node zerohead = new Node(0);
        Node onehead = new Node(0);
        Node twohead = new Node(0);
        Node zero = zerohead;
        Node one = onehead;
        Node two = twohead;

        Node curr = head;

        while (curr != null) {
            switch (curr.data) {
                case 0 -> {
                    zero.next = curr;
                    zero = zero.next;
                }
                case 1 -> {
                    one.next = curr;
                    one = one.next;
                }
                default -> {
                    two.next = curr;
                    two = two.next;
                }
            }
            curr = curr.next;
        }

        zero.next = (onehead.next != null) ? onehead.next : twohead.next;
        one.next = twohead.next;
        two.next = null;

        return zerohead.next;

    }

    public static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(2);

        System.out.println("Original list ");
        printList(head);

        head = sort012(head);
        System.out.println("Sorted list");
        printList(head);

    }
}