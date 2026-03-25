import java.util.Arrays;
import java.util.Stack;

public class nextgreter2 {

    public static int[] NextGreater(int arr[]) {

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            int ci = i % n;

            while (!st.isEmpty() && arr[ci] >= st.peek()) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(arr[ci]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 3, 1, 1 };  // Next Greater Element in Circular Array

        int res[] = NextGreater(arr);
        System.out.println(Arrays.toString(res));
    }
}
