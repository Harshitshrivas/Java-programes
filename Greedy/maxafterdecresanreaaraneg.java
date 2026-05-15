
import java.util.Arrays;


public class maxafterdecresanreaaraneg {

    public static void main(String[] args) {
       // int arr[] = {2 , 2, 1, 2, 1 };
         int arr[] = {100 ,  1 , 1000};
        int n = arr.length;
    

        Arrays.sort(arr);
        // Maximum Element After Decreasing and Rearranging
        for(int i =0; i<n; i++){
            if(i == 0){
                arr[i] = 1;
            }else{
                if(arr[i] - arr[i -1] > 1){
                    arr[i] = arr[i-1] + 1;
                }else{
                    arr[i] = arr[i-1];
                }
            }
        }
        System.out.println(arr[n-1]);
    }
}