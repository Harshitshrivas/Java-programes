public class arraytodll {
    Node head;

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node arraytoDll(int arr[]) {

        if (arr.length < 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node currNode = head;

        for (int i = 1; i < arr.length; i++) {

            Node newNode = new Node(arr[i]);
            currNode.next = newNode;
            newNode.prev = currNode;
            currNode = newNode;
        }
        return head;
    }

    public void printfront() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void printback() {
        Node cuNode = head;

        while (cuNode.next != null) { // Move to last node
            cuNode = cuNode.next;
        }

        while (cuNode != null) { // Traverse backword
            System.out.print(cuNode.data + " -> ");
            cuNode = cuNode.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        arraytodll dll = new arraytodll(); // create an instance of the arraytodll class
        dll.head = arraytoDll(arr); // convert the array to a doubly linked list and assign the head of the list to
                                    // the head variable of the arraytodll class
        System.out.println(" Forward order: ");
        dll.printfront();
        System.out.println(" Reverse order: ");
        dll.printback();
    }
}
