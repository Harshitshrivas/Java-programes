import java.util.HashMap;

public class longestSubarray22 {

    static int LongestSubarray1(int arr[], int k) {

        long sum = 0;
        int maxlength = 0;
        int start = -1;
        int end = -1;
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxlength = i + 1;
                start = 0;
                end = i;
            }

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);

                if (len > maxlength) {
                    maxlength = len;
                    start = map.get(sum - k) + 1;
                    end = i;
                }
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        // Print the longest subarray
        System.out.print("Longest Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        return maxlength;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println("Length of the longest subarray is: " + LongestSubarray1(arr, k));
    }
}
