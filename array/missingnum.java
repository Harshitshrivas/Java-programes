public class missingnum {

    static int findMissingNumber(int nums[], int n) {
        int totalsum = n * (n + 1) / 2; // formula to calculate the sum of first n natural numbers..
        int actualsum = 0;

        for (int i = 0; i < n; i++) {
            actualsum += nums[i];
        }
        return totalsum - actualsum;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 3, 5 };
        int n = nums.length;
        int missingNumber = findMissingNumber(nums, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
