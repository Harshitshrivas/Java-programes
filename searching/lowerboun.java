public class lowerboun {

    static  int lowerbound(int arr[], int key){   // function to find lower bound

        int low = 0;
        int high = arr.length - 1;
        int result = arr.length;      // default result if no element is found

        while( low <= high){

            int mid = low + (high - low)/2;
            if(arr[mid] >= key){
                result = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 8, 9, 12, 15};
        int key = 5;

        int index = lowerbound(arr, key);

        if(index == arr.length){
            System.out.println("Lower bound ni milla ");
        }else{
            System.out.println("The index of lower bound is : " + index);  // lower bound is the index of the first element that is greater than or equal to the key
        }
        
     }
}