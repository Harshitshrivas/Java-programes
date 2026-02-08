public class checkarray {
    public static boolean isSorted(int arr[]){
        
        for(int i =0; i<= arr.length -2; i++){

            if(arr[i] > arr[i+1]){
                return  false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
             int arr[] = {10, 5, 21, 30, 7, 45, 2, 11};// check array is sorted or not
             System.out.println(isSorted(arr));

             int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8};// check array is sorted or not
             System.out.println(isSorted(arr1));
    }
}
