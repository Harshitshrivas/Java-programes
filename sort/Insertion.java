public class Insertion {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        int n = arr.length;

        // for(int i =1; i<n;i++){     // time complexity 0n2
        //    int curr = arr[i];
        //    int prev = i-1;

        //    while(prev >=0 && arr[prev]>curr){
        //     arr[prev+1] = arr[prev];
        //      prev --;
        //    }

        //    arr[prev+1] = curr;
        // }

        for(int i =0; i<n; i++){     // time complexity 0n
           int j =i;
           while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
           }

        }

        System.out.println("The Sorted array are: ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
   }
}

