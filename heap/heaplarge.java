
import java.util.*;

public class heaplarge {
    public static void main(String[] args) {

        int arr[] = { 10, 5, 21, 30, 7, 45, 2, 11 };
        int k = 3; // Change this value to find the k-th largest element
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println("The " + k + "-th largest element is: " + pq.peek());


        // K Largest Elements (Return all k elements)
        List<Integer> res = new ArrayList<>(pq);
        //Collections.sort(res); 
        System.out.println(res);
    }
}
