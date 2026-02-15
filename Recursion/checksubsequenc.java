public class checksubsequenc {
    static boolean checkSubsequence(int i, int sum, int arr[], int k) {

        if (i == arr.length) {
            return sum == k;
        }
        return checkSubsequence(i + 1, sum + arr[i], arr, k) ||
                checkSubsequence(i + 1, sum, arr, k);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int k = 3;

      System.out.println(checkSubsequence(0, 0, arr, k));
        
    }
}
