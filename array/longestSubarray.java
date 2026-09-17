
import java.util.HashMap;

public class longestSubarray {

    static int LongestSubarrayyy(int arr[], int k) {

        long sum = 0;
        int maxlength = 0;

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxlength = i + 1;
            }

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxlength = Math.max(maxlength, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        System.out.println("Length of the longest subarray is: " + LongestSubarrayyy(arr, k));
    }
}
