public class Quick {

    static void quicksort(int arr[], int low, int high){

        if(low < high){
           int pivindx =  partion(arr, low, high);  // sabse pehla pivot ko shi jagah rakhega phir uska left ma pivot sa kam aur right ma pivot sa jada 
           quicksort(arr, low, pivindx -1);
           quicksort(arr, pivindx +1, high);
        }
    }

    static int partion(int arr[], int low, int high){
       
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i <j){
            while( i <= high && arr[i] <= pivot){
                i++;
            }
            while(j >= low && arr[j] > pivot){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
         
        // pivot ki value change karne ka liya 
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return  j;
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 2, 32, 45, 1, 6, 5};
        int n = arr.length;

        quicksort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
