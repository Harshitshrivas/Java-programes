public class longestmidd {
    public static void main(String[] args) {
        // 1 , 1 3  6 4 2 0 ,  Output = 6   {value is increasing and decreasing , I want to find the peak value in the array}
       // 2 , 4 , 3, 2, 1  , Output = 4

       int arr[] = {1, 3, 6, 4, 2, 0};
       int peak = 0;
       int n = arr.length;

       for(int i = 0; i < n; i++){
            if(i == 0){
                if(arr[i] > arr[i+1]){
                    peak = arr[i];
                }
            }
            else if(i == n-1){
                if(arr[i] > arr[i-1]){
                    peak = arr[i];
                }
            }
            else{
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    peak = arr[i];
                }
            }
       }
        System.out.println("The Peak Value is : " + peak);
    }
}
