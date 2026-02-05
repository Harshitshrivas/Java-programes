public class floor {
    static int floorsearch(int arr[], int key){
        int low = 0;
        int high = arr.length -1;
        int resut = -1;

        while(low <= high){
            
            int mid = low + (high - low) /2;

            if(arr[mid] <= key){
                resut = arr[mid];
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return  resut;
    }
    public static void main(String[] args) {
        int arr[]  = {10, 20, 30, 40, 50, 60, 70};
        int key = 65;

        int floor = floorsearch(arr, key);
        if(floor == -1){
            System.out.println("Floor ni milla");
            }
            else{
            System.out.println("The floor of the key is : " + floor);  // floor is the largest element in the array that is less than or equal to the key
            }
    }
}
