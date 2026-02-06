public class countoccurance {
    static  int firstoccurance(int arr[], int target){  // To find first occurance

        int low=0;
        int high = arr.length -1;
        int first = -1;

        while(low <= high){
            
            int mid = low + (high - low) /2;
            if(arr[mid] == target){
                first = mid;
                high = mid -1;                  // To continue searching in the left half for the first occurrence  
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return first;
    }

    static int lastoccurance(int arr[], int target){  // To find last ocuurance
        int low = 0;
        int high = arr.length -1;
        int last = -1;

        while(low <= high){

            int mid = low + (high - low)/2; 
            if(arr[mid] == target){
                last = mid;
                low = mid + 1;                 // To continue searching in the right half for the last occurrence
            }else if(arr[mid] > target){
                high = mid -1;
            }else{
                low = mid + 1;
            }
         }
         return last;
    }

     static int countOccurance(int arr[], int target){
        int first = firstoccurance(arr, target);
        if(first == -1){
            return 0;   // If the target element is not found in the array, return 0
        }
        int last = lastoccurance(arr, target);
        return last - first + 1;   // The count of occurrences is the difference between the last and first indices plus one
     }
    public static void main(String[] args) {
        int arr[]= {1, 2, 4, 6, 6, 6, 6, 9};
        int target = 6;
        System.out.println("Count of occurrences: " + countOccurance(arr, target));
    }
}
