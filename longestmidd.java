public class longestmidd {
    public static void main(String[] args) {
        // 1 , 1 3  6 4 2 0 ,  Output = 6   {value is increasing and decreasing , I want to find the peak value in the array}
       // 2 , 4 , 3, 2, 1  , Output = 4

      int arr[] = {1, 3, 6, 4, 2, 0};
      int low = 0;
      int high = arr.length -1;

      while(low < high){
        int mid = low + (high - low)/2;
        if(arr[mid] < arr[mid +1]){ // if mid value is less than mid +1 value then peak value will be on right side of the array
            low = mid +1;
        }else{
            high = mid; // if mid value is greater than mid +1 value then peak value will be on left side of the array
        }

      }
        System.out.println("The Peak Value is : " + arr[low]); // low and high will be equal at the end of the loop, so we can return either low or high as the peak value
    }
}
