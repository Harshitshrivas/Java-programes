
import java.util.Stack;

public class prefixevalution {
    static int PrefixEvalution(String s) {
        Stack<Integer> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            } else {

                int op1 = st.pop();
                int op2 = st.pop();
                switch (ch) {
                    case '+' -> st.push(op1 + op2);
                    case '-' -> st.push(op1 - op2);
                    case '*' -> st.push(op1 * op2);
                    case '/' -> st.push(op1 / op2);

                }
            }
        }
        return st.peek();

    }

    public static void main(String[] args) {
        String exp = "-+7*45+20";
        System.out.println(PrefixEvalution(exp));
    }
}
