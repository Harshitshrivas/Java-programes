public class odd_even {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node ODDEVEN(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
            Node odd = head;
            Node even = head.next;
            Node evenhead = even;

            while (even != null && even.next != null) {

                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenhead;
            return head;
        }

        public static void printList(Node head) {
            Node curr = head;

            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        Node.printList(head);
        head = Node.ODDEVEN(head);
        System.out.println("List after rearranging odd and even nodes:");
        Node.printList(head);

    }
}
