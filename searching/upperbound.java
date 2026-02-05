public class upperbound {

    public  static int UpperBound(int arr[], int key){
       
        int low = 0;
        int high = arr.length - 1;
        int result = arr.length;

        while(low <= high){
          
            int mid = low + high /2;

            if(arr[mid] > key){
               // result =arr[ mid];   // value of upper bound
               result = mid;            // index of upper bound
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return result;
    } 
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 8, 9,11, 12, 15};
        int key = 5;
        
        int index = UpperBound(arr, key);
       
        if(index == arr.length){
            System.out.println("Upper bound ni milla ");
    }else{
            System.out.println("The index of Upper bound is : " + index);  // upper bound is the index of the first element that is greater than the key
        }
    }
}
