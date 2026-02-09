public class nonduplicate {
    static int nonrepeating(int arr[]){
        int xor = 0;

        for(int i =0; i<arr.length; i++){
            xor = xor ^ arr[i];   // XOR of all elements will give the non-repeating element

        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 6, 6};
        int result = nonrepeating(arr);
        System.out.println("The non-repeating element is : " + result);
    }
}
