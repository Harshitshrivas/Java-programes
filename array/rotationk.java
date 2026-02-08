public class rotationk {
    public static void rotatek(int arr[],int k){
       
        int n = arr.length;
        k = k%n;

        revers(arr, 0, n-1);  // reverse the whole array
        revers(arr, 0, k-1); // reverse the first k elements
        revers(arr, k, n-1);       // reverse the remaining n-k elements

    }
    public static void revers(int arr[] , int start, int end){  // reverse the array from start to end

        while(start < end){               // swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        rotatek(arr, k);
         System.out.println("The rotated array is : ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
