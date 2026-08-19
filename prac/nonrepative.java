public class nonrepative {

    static int nonnduplicate(int arr[]){

        int xor = 0;
        for(int i =0; i<arr.length; i++){ // xor method , ek non - repeative nikalne ka liya 
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 1, 3, 4};
      System.out.println(nonnduplicate(arr)); 
      
    }
}
