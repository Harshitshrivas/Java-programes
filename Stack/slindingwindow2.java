
import java.util.ArrayDeque;
import java.util.Deque;

public class slindingwindow2 {

    public static int[] maxSlindingWindoww(int arr[], int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        int res[] = new int[n - k + 1];
        int a = 0;

        for (int i = 0; i < n; i++) {

            while (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();   // first delete hojaygi 3-3 =0 hoga jab
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            dq.offer(i);

            if (i >= k - 1) {
                res[a++] = arr[dq.peek()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] result = maxSlindingWindoww(arr, k);
        System.out.print("Maximums in each sliding window: ");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
