public class checkpalindrom {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean ispalindrome(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverse(slow); // reverse the second half of the linked list
        Node curr = head;

        while (newHead != null) {
            if (curr.data != newHead.data) {
                reverse(head); // reverse the second half back to original
                return false;
            }
            curr = curr.next;
            newHead = newHead.next;
        }
        reverse(head); // reverse the second half back to original
        return true;
    }

    public Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        checkpalindrom list = new checkpalindrom();
        if (list.ispalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }

    }
}
