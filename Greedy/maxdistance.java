public class maxdistance {
    public static int maxDistnce(int arr[][]){
        int min = arr[0][0];
        int max = arr[0][arr[0].length - 1];
        int ans = 0;

        for (int[] arr1 : arr) {    // for each array in the 2D array
            int currentmin = arr1[0];
            int currentmax = arr1[arr1.length - 1];
            ans = Math.max(ans , Math.abs(currentmin - max));
            ans = Math.max(ans , Math.abs(currentmax - min));
            min = Math.min(min , currentmin);
            max = Math.max(max , currentmax);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2 , 3}, { 4 , 5}, {1 , 2 , 3}};
        System.out.println("The maximum distance is: " + maxDistnce(arr));
    }
}
