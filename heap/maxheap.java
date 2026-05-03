
import java.util.Collections;
import java.util.PriorityQueue;

public class maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> Maxheap = new PriorityQueue<>(Collections.reverseOrder());

        Maxheap.add(10);
        Maxheap.add(20);
        Maxheap.add(5);
        Maxheap.add(30);
        Maxheap.add(15);
        System.out.println("Max Heap: " + Maxheap); // Note: The internal order may not be sorted
        System.out.println("Peek: " + Maxheap.peek());
        System.out.println("Poll: " + Maxheap.poll());
        System.out.println("Max Heap after poll: " + Maxheap);
    }
}
