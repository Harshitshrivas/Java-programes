
import java.util.PriorityQueue;

public class mergeKlist {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minheap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                minheap.add(node); // Add the head of each linked list to the min-heap
            }
        }
        ListNode dummy = new ListNode(0); // Dummy node to help with merging
        ListNode current = dummy; // Pointer to the current node in the merged linked list

        while (!minheap.isEmpty()) {
            ListNode smallest = minheap.poll(); // Remove the smallest node from the min-heap
            current.next = smallest; // Add the smallest node to the merged linked list
            current = current.next; // Move the current pointer to the next node in the merged linked list
            if (smallest.next != null) {
                minheap.add(smallest.next); // Add the next node from the same linked list to the min-heap
            }
        }
        return dummy.next; // Return the head of the merged linked list
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);
        ListNode[] lists = { head1, head2, head3 }; // Array of linked list heads

        ListNode mergedHead = mergeKLists(lists);
        // Print the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
