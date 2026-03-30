public class slindingwindow {

    public static int[] maxSlindingWindow(int [] nums , int  k){
        
        int n = nums.length;
        int res[] = new int[n-k+1];
        int j = 0;
        
        for(int i =0; i<= n-k; i++){
           int max = Integer.MIN_VALUE;
           for(int m = i; m < i+k; m++){
              max = Math.max(max, nums[m]);
           }
           res[j++] = max;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] result = maxSlindingWindow(arr, k);
        System.out.print("Maximums in each sliding window: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
