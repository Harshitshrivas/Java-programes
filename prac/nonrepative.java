
import java.util.HashMap;

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

      int arr2[] = { 1, 2, 3, 4, 1, 4}; // Multiple Non repative nikalne
      HashMap<Integer , Integer> map = new HashMap<>();

        // Frequency count
      for(int i =0; i<arr2.length; i++){
        map.put(arr2[i], map.getOrDefault(arr2[i], 0)+1);
      }

        // Print elements having frequency 1
       System.out.print("Non-repeating elements: ");

      for(int j=0; j<arr2.length; j++){
        if(map.get(arr2[j]) == 1){
            System.out.print(arr2[j] + " ");
        }
      }
    
    }
}
