public class add_1_LL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addone(Node head){

        if(head == null){
            return  new Node(1);
        }

        

       

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

        

        System.out.println("List after adding 1:");
        list.printList(head);
    }
}
