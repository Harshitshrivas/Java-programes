public class reversearr {
    static void reverse(int arr[], int start, int end){
       
        if( start >= end){
            return;
        }
       // we will swap the first and last elements of the array, then we will call the function recursively for the remaining elements of the array
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start +1, end -1);
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
