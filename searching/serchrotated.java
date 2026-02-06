public class serchrotated {
    static int searchrotated(int arr[], int target){
        int low = 0;
        int high = arr.length -1;


        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target) return mid;  // If the target is found at mid, return the index

            if(arr[low] <= arr[mid]){     // Left half is sorted
                 if(arr[low] <= target && target < arr[mid]){  // If the target is in the left half, update high to mid - 1 to search in the left half
                     high = mid-1;
                 }else{
                    low = mid +1;
                 }
            }else{       // Right half is sorted
                if(arr[mid] <= target && target <= arr[high]){  // If the target is in the right half, update low to mid + 1 to search in the right half
                    low = mid +1;
                }else{
                    high = mid -1;
            }
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int result = searchrotated(arr, target);   // Search for the target in the rotated sorted array and store the result index
        System.out.println("Element found at index: " + result);
    }
}
