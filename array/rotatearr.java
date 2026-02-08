public class rotatearr {
    public static void main(String[] args) {
    
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int temp = arr[0];        // store first element in temp
        for(int i =1;i< n; i++){
            arr[i -1] = arr[i];    // move element to left
           } 
           arr[n-1] = temp;  // last element is temp
           System.out.println("The rotated array is : ");

              for(int i =0; i<n; i++){
                System.out.print(arr[i] + " ");  
              }
        }
    }

