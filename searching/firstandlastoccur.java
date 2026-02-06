public class firstandlastoccur {
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
    public static void main(String[] args) {
        int arr[]= {1, 2, 4, 6, 6, 6, 6, 9};   //O(log n) for both first and last occurrence, so overall O(log n) time complexity
        int target = 6;

        int first = firstoccurance(arr, target);
        int last = lastoccurance(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);


    }
}
