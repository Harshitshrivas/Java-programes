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

    public void addfirst(int data) { // we will add a new node at the beginning of the linked list by changing the
                                     // head pointer to the new node and the next pointer of the new node to the
                                     // current head node

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    }

    public void addLast(int data) { // we will add a new node at the end of the linked list by traversing the linked
                                    // list until we reach the last node and then we will change the next pointer of
                                    // the last node to the new node
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

    public void printList() { // we will traverse the linked list and print the data of each node until we
                              // reach the end of the linked list
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() { // we will delete the first node of the linked list by changing the head pointer
                                // to the next node of the current head node
        if (head == null) {
            System.out.println("List is Empty...");
            return;
        }
        head = head.next;
    }

    public void deleteLast() { // we will delete the last node of the linked list by traversing the linked list
                               // until we reach the second last node and then we will change the next pointer
                               // of the second last node to null

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

    }

    public void deletekey(int key) { // we will delete a node with a given key by traversing the linked list until we
                                     // find the node with the given key and then we will change the next pointer of
                                     // the previous node to the next pointer of the current node

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (key == 1) {
            head = head.next;
            return;
        }

        Node currNode = head;
        Node prevNode = null;
        int count = 1;
        while (currNode != null && count != key) {
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }

        if (currNode == null) {
            System.out.println("Key not found in the list");
        } else if (prevNode != null) {
            prevNode.next = prevNode.next.next;
        }

    }
    
    public void deletekeyvalue(int key){
         if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if(head.data == key){
            head= head.next;
            return;
        }
        Node currNode = head;
        Node prevNode = null;

        while(currNode != null){

            if(currNode.data == key && prevNode != null){ // if we find the node with the given key and the previous node is not null then we will change the next pointer of the previous node to the next pointer of the current node
                prevNode.next = prevNode.next.next;
                return;
            }
          prevNode = currNode;
          currNode = currNode.next;
        }

       System.out.println("Key not found in the list");
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

        list.addfirst(5);
        list.addfirst(1);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("After deleting the node with key 2:");
        list.deletekey(2);
        list.printList();

        System.out.println("After deleting the node with key 1:");
        list.deletekey(1);
        list.printList();

        list.addfirst(5);
        list.addfirst(1);
        System.out.println("Linked List:");
        list.printList();
        
        System.out.println("After deleting the node with key value 10:");
        list.deletekeyvalue(10);
        list.printList();
    }
}
