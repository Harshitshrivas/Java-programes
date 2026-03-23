import java.util.Stack;

public class postfixtoinfix {
    static String PostfixtoInfix(String s) {

        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } else {
                String op1 = st.pop();
                String op2 = st.pop();

                String temp = '(' + op2 + ch + op1 + ')';
                st.push(temp);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String exp = "ab*c+";
        System.out.println(PostfixtoInfix(exp));
    }
}
