
import java.util.Stack;

public class validsequce {

    static boolean Validate(int[] pushed, int[] popped) {

        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            int val = pushed[i];
            st.push(val);

            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = { 1, 2, 3, 4, 5 };
        int[] popped = { 4, 5, 3, 2, 1 };

        if (Validate(pushed, popped)) {
            System.out.println("Valid Stack Sequence ");
        } else {
            System.out.println("Invalid Stack Sequence ");
        }
    }
}
