public class removeduplicate {

    static  int removedupli(int arr[]){
        int i =0;

    for(int j=1; j< arr.length; j++){
        if(arr[j] != arr[i]){
            i++;
            arr[i] = arr[j];
        }
    }
    return i +1;
    }

    public static void main(String[] args) {
    int arr[] = {0, 0, 0, 1, 2, 3, 3, 3,4, 5, 5,6};

    int result = removedupli(arr);

    System.out.println("Unique conut "+ result);
    for(int i=0; i< result; i++){
        System.out.print(arr[i] + " ");
    }
    
    }
}
