public class fixedsizewindow {
    public static void main(String[] args) {

        int [] nums = {2,1,5,1,3,2};
        int k = 3;

        for(int i =0; i<nums.length - k +1; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += nums[j];
            }
            System.out.println("Sum of subarray starting at index " + i + ": " + sum);  
        }  
    }
}
