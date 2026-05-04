
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class kfrequent {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 2, 2, 3, 2, 1, 2, };
        int k = 2; // Change this value to find the k most frequent elements
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a, b) -> freq.get(a) - freq.get(b)); // Min-heap based on frequency
        for (int key : freq.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println("The " + k + "-th most frequent element is: " + pq.peek());
        // K Most Frequent Elements (Return all k elements)
        System.out.println("All " + k + " most frequent elements are: " + pq);

    }
}
