
import java.util.*;

public class ranktransform {
    public static void main(String[] args) {

        int arr[] = { 50, 40, 10, 20, 30 };
        int temp[] = arr.clone();
        System.out.println("Original Array: " + Arrays.toString(temp));
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < temp.length; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
            }
            rank++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        System.out.println("Rank Transformed Array: " + Arrays.toString(arr));

        // Time Complexity: O(n log n) due to sorting the array, where n is the number
        // of elements in the input array.
        // Space Complexity: O(n) for the temporary array and the rank array, and O(n)
        // for the HashMap in the worst case when all elements are unique.

    }
}
