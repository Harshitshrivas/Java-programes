public class Minimumsubrray {

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int minLenth = Integer.MAX_VALUE;
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            while (sum >= target) {
                minLenth = Math.min(minLenth, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }
        if (minLenth == Integer.MIN_VALUE) {
            return 0;
        } else {
            return minLenth;
            
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum subarray length: " + result);
    }
}