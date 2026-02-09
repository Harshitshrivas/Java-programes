public class movezero {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,3,0,0,4,5,0};
        int n = arr.length;
        int count = 0; // count of non-zero elements

        for(int i =0; i<n ; i++){     // move non-zero elements to the front of the array
            if(arr[i] != 0){
                arr[count] = arr[i];  // move non-zero element to the count index
                count ++;
            }
        }
        while(count < n){   // fill the remaining elements with zero
            arr[count] = 0;
            count++;
        }

        System.out.println("The array after moving zeroes is : ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
