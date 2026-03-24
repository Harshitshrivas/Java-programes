
import java.util.Stack;

public class postfixevalution {
    static int PostfixEvalution(String s) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            } else {
                int op1 = st.pop();
                int op2 = st.pop();

                switch (ch) {
                    case '+' -> st.push(op2 + op1);
                    case '-' -> st.push(op2 - op1);
                    case '*' -> st.push(op2 * op1);
                    case '/' -> st.push(op2 / op1);

                }

            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String exp = "23*54*+9-";
        System.out.println(PostfixEvalution(exp));
    }
}
