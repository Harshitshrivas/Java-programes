
import java.util.PriorityQueue;

public class baseeic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-heap by default
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);
        System.out.println("Priority Queue: " + pq); // Note: The internal order may not be sorted
        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll: " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);
        System.out.println("Size: " + pq.size());
    }
}
