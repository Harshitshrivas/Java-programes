public class Leader {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        int maxright = arr[n-1];  // initialize maxright with last element
        System.out.print(maxright + " ");

        for(int i = n -2 ; i >= 0 ; i--){  // traverse from right to left
             
            if(arr[i] >= maxright){
                maxright = arr[i];
                System.out.print(maxright + " ");   // leadre is greater than all elements to its right
            }
        }


    }
}
