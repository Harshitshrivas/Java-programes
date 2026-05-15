
import java.util.Arrays;


public class maxafterdecresanreaaraneg {

    public static void main(String[] args) {
        int arr[] = {2 , 2, 1, 2, 1 };
       //  int arr[] = {100 ,  1 , 1000};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        arr[0] = 1;
        Arrays.sort(arr);
        // Maximum Element After Decreasing and Rearranging
        for(int i =1; i<n; i++){
            if(arr[i] - arr[i-1] > 1){
                arr[i] = arr[i-1] + 1;
            }
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}