public class stackLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;
    static int size = 0;

    static void push(int value) {

        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;

    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
        } else {
            int delete = top.data;
            top = top.next;
            size--;
            System.out.println("Deleted: " + delete);
        }
    }

    static void peek() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("TOP: " + top.data);
        }
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack Element...");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    static boolean isEmpty() {
        return top == null;
    }

    static int sizee() {
        return size;
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        display();
        peek();
        pop();
        display();
        peek();
        System.out.println("Is Empty: " + isEmpty());
        System.out.println("Size: " + sizee());
    }
}
