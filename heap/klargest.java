
import java.util.Arrays;

public class klargest {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 21, 30, 7, 45, 2, 11 };
        int k = 2; // Change this value to find the k-th largest element
        Arrays.sort(arr);
        int ans =  arr[arr.length - k];
        System.out.println("The " + k + "-th largest element is: " + ans);
    }
}
