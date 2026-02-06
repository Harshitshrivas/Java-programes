public class minimunsorted {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7,  1, 2};
        int low = 0;
        int high = arr.length -1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) /2;

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);  // Update the minimum element found so far
                low = mid +1;  // Move to the right half to search for a smaller element
            }else{
                ans = Math.min(ans, arr[mid]);  // Update the minimum element found so far
                high = mid -1;  // Move to the left half to search for a smaller element
            }
        }
        System.out.println("Minimum element in the rotated sorted array is: " + ans);

    }
}
