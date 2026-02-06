public class firstandlast {

    static int[] firstandLast(int arr[], int target){
        int first = -1;
        int last = -1;

        for(int i =0; i<arr.length; i++){   //O(n)
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int arr[]= {1, 2, 6, 4, 6, 6, 6, 9};
        int target = 6;
        int result[] = firstandLast(arr, target);   // iterate through the array once to find first and last occurrence
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}
