public class detectloop {
    public static class Node {

        Node next;

        Node(int data) {
            this.next = null;
        }
    }

    public boolean hasloop(Node head) { // Floyd's Tortoise and Hare algorithm

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {  // Loop detected
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating a loop for testing
        head.next.next.next.next = head.next; // Looping back to the head

        detectloop list = new detectloop();
        if (list.hasloop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }
}
