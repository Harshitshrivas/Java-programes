
import java.util.Arrays;
import java.util.Stack;

public class astroidcollesion {

    public static int[] collesion(int[] astroid) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < astroid.length; i++) {
            int a = astroid[i];

            if (a > 0) {
                st.push(a);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < -a) {
                    st.pop();
                }

                if (st.isEmpty() || st.peek() < 0) {
                    st.push(a);
                }

                if (st.peek() == -a) {
                    st.pop();

                }
            }
        }
        int res[] = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, -5 };

        int[] result = collesion(arr);
        System.out.println("After collision: " + Arrays.toString(result));
    }
}
