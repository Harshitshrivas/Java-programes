public class kadane {
    public static void main(String[] args) {
        int arr[] = {-2, -3,4, -1, -2, 1, 5, -3 };
        int sum = 0;
        int max = Integer.MIN_VALUE;

        int start = 0;
        int ansstart = 0;
        int end = 0;

        for(int i =0; i<arr.length; i++){  
             
            sum += arr[i];
            if(sum > max){             // update the maximum sum if the current sum is greater than the maximum sum
                max = sum;
                ansstart = start; // update the starting index of the maximum sum subarray
                end = i;
            } 
            if(sum < 0){     // if the sum becomes negative, reset it to 0 as a negative sum will not contribute to a maximum sum in future iterations
                sum = 0;
                start = i+1;
            }
        }
        System.out.println("max = " + max);  // time complexity is O(n) and space complexity is O(1)

        System.out.println("The subarray with the maximum sum is : ");
        for(int i = ansstart; i<= end; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
