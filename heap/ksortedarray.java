
import java.util.Arrays;
import java.util.PriorityQueue;

public class ksortedarray {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 3, 2, 8, 10, 9 };
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;

        for (int i = 0; i <= k; i++) { // Add the first k+1 elements to the priority queue
            pq.add(arr[i]);
        }

        for (int i = k + 1; i < arr.length; i++) { 
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()) { // Remove the remaining elements from the priority queue and add them to the
                                // array
            arr[index++] = pq.poll();
        }

        System.out.println(Arrays.toString(arr)); // Using Arrays.toString() to print the sorted array

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) { // Printing the sorted array using a loop
            System.out.print(arr[i] + " ");
        }

    }
}
