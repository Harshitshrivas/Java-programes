public class printsubset {
    static void printSubset(int arr[], int index, String current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        printSubset(arr, index + 1, current + arr[index] + " "); // current string me arr[index] add karna chahiye,
                                                                 // kyunki current string me arr[index] add karne se
                                                                 // current string me arr[index] add ho jayega, aur
                                                                 // index ko 1 se badhana chahiye, kyunki current string
                                                                 // me arr[index] add karne ke baad index ko 1 se
                                                                 // badhana chahiye, taki next element ko current string
                                                                 // me add kiya ja sake

        printSubset(arr, index + 1, current);// current string me arr[index] add nahi karna chahiye, kyunki current
                                             // string me arr[index] add nahi karne se current string me arr[index] add
                                             // nahi hoga, aur index ko 1 se badhana chahiye, kyunki current string me
                                             // arr[index] add nahi karne ke baad index ko 1 se badhana chahiye, taki
                                             // next element ko current string me add kiya ja sake

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println("Using backtracking");
       printSubset(arr, 0, ""); // backtracking , O(2^n) time complexity, kyunki har element ke liye 2 choices hoti hai, add karna ya add nahi karna, aur O(n) space complexity, kyunki current string me n elements add ho sakte hai
        int n = arr.length;
         
        System.out.println("Using bit manipulation");
        for(int i = 0 ; i< (1<<n) ; i++){
            for(int j =0; j<n ; j++){
                if((i & (1 << j)) != 0){
                   System.out.print(arr[j] + " ");
                }
            }
            System.out.println( );
        }
    }
}
