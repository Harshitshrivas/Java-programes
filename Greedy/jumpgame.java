public class jumpgame {
    public static boolean canjump(int[] nums) {
        int maxreach = 0;
        for (int i = 0; i < nums.length; i++) { // we are checking if we can reach the current index or not, if we can't
                                                // reach the current index then we can't jump to the end of the array
            if (i > maxreach) // if we can't reach the current index then we can't jump to the end of the
                              // array
                return false;
            maxreach = Math.max(maxreach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        System.out.println(canjump(nums));
    }
}
