public class kadane {
    public static void main(String[] args) {
        int arr[] = {-2, -3,4, -1, -2, 1, 5, -3 };
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){   // iterate through the array and calculate the sum of subarrays
            sum += arr[i];
            if(sum > max){             // update the maximum sum if the current sum is greater than the maximum sum
                max = sum;
            } 
            if(sum < 0){     // if the sum becomes negative, reset it to 0 as a negative sum will not contribute to a maximum sum in future iterations
                sum = 0;
            }
        }
        System.out.println("max = " + max);  // time complexity is O(n) and space complexity is O(1)
    }
}
