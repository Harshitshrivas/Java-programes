public class delete {
    Node head;

    class Node { 
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) { // we will add a new node at the beginning of the linked list by changing the head pointer to the new node and the next pointer of the new node to the current head node

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    }

    public void addLast(int data) { // we will add a new node at the end of the linked list by traversing the linked list until we reach the last node and then we will change the next pointer of the last node to the new node
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() { // we will traverse the linked list and print the data of each node until we reach the end of the linked list
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){ // we will delete the first node of the linked list by changing the head pointer to the next node of the current head node
        if(head == null){
            System.out.println("List is Empty...");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){ // we will delete the last node of the linked list by traversing the linked list until we reach the second last node and then we will change the next pointer of the second last node to null

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;

    }

    public static void main(String[] args) {
        delete list = new delete(); // creating an object of the delete class

        list.addfirst(10);
        list.addLast(20);
        list.addLast(30);

        list.addfirst(5);
        list.addfirst(1);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("After deleting the first node:");
        list.deleteFirst();
        list.printList();

        System.out.println("After deleting the first node again:");
        list.deleteFirst();
        list.printList();

        System.out.println("After deleting the last node:");
        list.deleteLast();
        list.printList();

         System.out.println("After deleting the last node again:");
         list.deleteLast();
         list.printList();

        
    }
}
