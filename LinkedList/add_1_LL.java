public class add_1_LL {

   public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

 public static Node addOne(Node head) {

    head = reverse(head);

    Node temp = head;
    int carry = 1;

    while (temp != null) {

        int sum = temp.data + carry;
        temp.data = sum % 10;
        carry = sum / 10;

        if (carry == 0) {
            break;
        }

        if (temp.next == null && carry > 0) {
            temp.next = new Node(carry);
            carry = 0;
        }

        temp = temp.next;
    }

    head = reverse(head);
    return head;
}

  public static Node reverse(Node head) {
    Node prev = null;
    Node current = head;
    Node next ;

    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;

  }
      public void printList(Node head) {

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

        add_1_LL list = new add_1_LL();
        System.out.println("Original List:");
        list.printList(head);

        head = addOne(head);

        System.out.println("List after adding 1:");
        list.printList(head);
    }
}
