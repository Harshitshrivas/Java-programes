public class SortColour2 {
    
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0, 2, 1, 0};
        int low = 0;
        int high = arr.length -1;
        int mid = 0;

        while(mid <= high){

           if(arr[mid] == 0){    
            int temp = arr[low]; // If the element is 0, swap it with the element at low and increment both low and mid
            arr[low] = arr[mid];
            arr[mid] = temp; 
            low++;
            mid++;
           }
           
           else if(arr[mid] == 1){  // If the element is 1, just move to the next element
            mid++;
           }

           else{    // arr[mid] == 2  // If the element is 2, swap it with the element at high and decrement high
            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;
            high --;
           }
           
        }
        for(int i =0; i<arr.length; i++){  // Time complexity is O(n) and space complexity is O(1)
            System.out.print(arr[i] + " ");
        }


       
    }
}
