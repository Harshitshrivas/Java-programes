public class Binery {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 60, 70, 85, 90};
        int key = 85;
        int index = -1;
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            
            int mid = low + (high - low)/2;
            if(arr[mid] == key){
                index = mid;
                break;
            }else if(arr[mid] < key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(index != -1){
            System.out.println("Element found at index " + index);
        }else{
            System.out.println("Element Not Found");
        }
    }
}
