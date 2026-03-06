public class reversek {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverseKgroup(Node head, int k) { // reverse a list in k group

        Node temp = head;
        Node prevNode = null;

        while (temp != null) {
            Node kthnode = findkthNode(temp, k);

            if (kthnode == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }

            Node nextNode = kthnode.next;
            kthnode.next = null;
            Node newhead = reverse(temp);

            if (temp == head) {
                head = newhead;
            } else if (prevNode != null) {
                prevNode.next = newhead;
            }
            prevNode = temp;
            temp = nextNode;

        }
        return head;
    }

    public Node findkthNode(Node head, int k) {

        k = k - 1;

        while (head != null && k > 0) {
            head = head.next;
            k--;
        }
        return head;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curNode = head;
        Node next;

        while (curNode != null) {
            next = curNode.next; // store the next node before changing the link
            curNode.next = prev; // reverse the link

            prev = curNode;
            curNode = next;
        }
        return prev;
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

        reversek list = new reversek();
        System.out.println("Original list"); // reverse in k group
        printlist(head);
        
        head = list.reverseKgroup(head, 2);
        System.out.println("Reverse List are: ");
        printlist(head);


    }
}
