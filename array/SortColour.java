public class SortColour {
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0, 2, 1, 0};
        
        for(int i =0; i<arr.length; i++){
            int smallest = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(int i =0; i<arr.length; i++){  // Time complexity is O(n^2) and space complexity is O(1)
            System.out.print(arr[i] + " ");
        }

    }
}
