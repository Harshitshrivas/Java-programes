import java.util.HashMap;

public class twosum2 {

    public static int[] twoSumm(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 18;

        int result[] = twoSumm(arr, target); // HashMap approch
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + " are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }

    }
}
