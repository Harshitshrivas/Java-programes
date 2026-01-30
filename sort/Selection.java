
public class Selection{
    public static void main(String[] args) {
        int arr[] = {4, 78, 23, 21, 2 ,7, 42, 1};
        int n = arr.length;
        
        for(int i=0; i<n-1; i++){
            int small = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[small]){
                   small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array is : ");
      for(int i = 0; i<arr.length ;i++){
        System.out.print(arr[i] + " ");
      }
    }
}