
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ksmallest {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 21, 30, 7, 45, 2, 11 };
        int k = 4; // Change this value to find the k-th smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println("The " + k + "-th smallest element is: " + pq.peek());

        // All K sa chotee
        List<Integer> res =new ArrayList<>(pq);
        System.out.println("All Smallest K element are: "+ res);
    }
}
