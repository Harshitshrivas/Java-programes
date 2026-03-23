import java.util.Stack;

public class prefixtoinfix {

    static String PrefixToInfix(String s) {

        Stack<String> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String Combined = '(' + op1 + ch + op2 + ')';
                st.push(Combined);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix : " + PrefixToInfix(exp));
    }
}
