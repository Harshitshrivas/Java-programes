
import java.util.Stack;

public class parenthesisss {

    static boolean isparanthesis(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                else if (ch == ']' && st.peek() != '[')
                    return false;
                else if (ch == '}' && st.peek() != '{')
                    return false;
                else if (ch == ')' && st.peek() != '(')
                    return false;

                else
                    st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";

        if (isparanthesis(s)) {
            System.out.println("The Paranthesis is balanced");
        } else {
            System.out.println("The Paranthesis is not balanced");
        }
    }
}
