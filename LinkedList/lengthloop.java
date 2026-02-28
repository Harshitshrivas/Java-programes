
public class lengthloop {

    public static class Node {
        Node next;

        public Node(int data) {
            this.next = null;
        }
    }

    public static int length(Node slow, Node fast) { // Calculate the length of the loop

        int count = 1;
        fast = fast.next;

        while (fast != slow) {
            count++;
            fast = fast.next;
        }
        return count;
    }

    public static int countNodes(Node head) { // Floyd's Tortoise and Hare algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return length(slow, fast);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        // Creating a loop for testing
        head.next.next.next.next.next.next.next.next.next = head.next.next; // Looping back to the head

        lengthloop list = new lengthloop();
        @SuppressWarnings("static-access") // Suppressing the warning for static method call
        int loopLength = list.countNodes(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop in the linked list: " + loopLength);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
