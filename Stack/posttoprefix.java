import java.util.Stack;

public class posttoprefix {

    static String PostfixtoPrefix(String s) {

        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String temp = ch + op2 + op1;
                st.push(temp);

            }
        }
       return st.peek();
    }

    public static void main(String[] args) {
        String exp = "ABC/-AK/L-*";
        System.out.println(PostfixtoPrefix(exp));
    }
}
