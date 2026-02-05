public class ceill {
    static  int ceilling(int arr[], int key){
        int low = 0;
        int high = arr.length-1;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low) /2;

            if(arr[mid] >= key){
                result = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
         int arr[]  = {10, 20, 30, 40, 50, 60, 70};
        int key = 65;

        int index = ceilling(arr, key);
        System.out.println("Ceiling of key is: " + index); // ceiling is the smallest element in the array that is greater than or equal to the key
    }
}
