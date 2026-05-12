public class jumpgame2 {

    public static int canJump(int[] nums) {

        int jump = 0;
        int end = 0;
        int maxreach = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            maxreach = Math.max(maxreach, i + nums[i]);

            if (i == end) {
                jump++;
                end = maxreach;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        System.out.println(canJump(nums));
    }
}
