import java.util.Arrays;
import java.util.Stack;

public class nextgreterelemnt {

    public static int[] Nextgreater(int arr[]) {

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10 };
        int result[] = Nextgreater(arr);
        System.out.println(Arrays.toString(result));
    }
}
