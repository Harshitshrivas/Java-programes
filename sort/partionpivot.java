public class partionpivot {

    public static int[] partition(int arr[], int pivot) {
        int n = arr.length;
        int ans[] = new int[n];
        int i = 0;
        int j = n - 1;
        int left = 0;
        int right = n - 1;

        while (i < n) {
            if (arr[i] < pivot) {
                ans[left++] = arr[i];
            }
            if (arr[j] > pivot) {
                ans[right--] = arr[j];
            }
            i++;
            j--;
        }
        while (left <= right) {
            ans[left++] = pivot;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        System.out.println("Pivot: " + pivot);
        int result[] = partition(arr, pivot);
        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
}
