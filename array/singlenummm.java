public class singlenummm {
    static int singleNumberrr(int[] nums) {

        int xor = 0;
        for(int i =0; i<nums.length; i++){
            int num = nums[i];
            xor = xor ^ num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println("The Single num are as follow: " + singleNumberrr(nums));
    }
}
