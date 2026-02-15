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
        printSubset(arr, 0, "");
    }
}
