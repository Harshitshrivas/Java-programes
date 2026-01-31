public class linear {

    static  int LinearSearch(int arr[], int key){
       
        for(int i=0; i<arr.length; i++){
          if(arr[i] == key){
            return i;
          }
        }
        return  -1;

    }
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 50, 70, 80};
        int key = 50;
        int result = LinearSearch(arr, key);

        if(result == -1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element found at index " + result);
        }

    }
}
