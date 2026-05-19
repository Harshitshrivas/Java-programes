public class fixedsizewindow {
    public static void main(String[] args) {

        int[] nums = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int sum = 0;
        for (int i = 0; i < k; i++) { // calculate the sum of the first window
            sum += nums[i];
        }
        int maxSum = sum;
        for (int j = k; j < nums.length; j++) {
            sum += nums[j] - nums[j - k]; // add the next element and remove the first element of the previous window
            maxSum = Math.max(maxSum, sum); // update the maximum sum if the
        }
        System.out.println("The maximum sum of a subarray of size " + k + " is: " + maxSum);

    }
}
