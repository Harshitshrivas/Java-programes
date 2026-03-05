public class intersectionn {
   public  static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public  static Node intersectionpoint(Node headA, Node headB) {

        if (headA == null || headB == null) {
            return null;
        }

        Node a = headA;
        Node b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        // Common part
        Node n1 = new Node(8);
        Node n2 = new Node(4);
        Node n3 = new Node(5);

        n1.next = n2;
        n2.next = n3;

        // List A
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = n1;

        // List B
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = n1;

        Node result = intersectionpoint(headA, headB);
       if (result != null) {
            System.out.println("Intersection at: " + result.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
