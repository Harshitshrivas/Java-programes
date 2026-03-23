
import java.util.Stack;

public class infixtopost {

    static int precedence(char c) {

        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    static String InfixtoPostfix(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z' ||
                    ch >= 'a' && ch <= 'z' ||
                    ch >= '0' && ch <= '9') {
                res.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop(); // remove '('
            } else {
                while (!st.isEmpty() && precedence(s.charAt(i)) <= precedence(st.peek())) {
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String exp = "a*(b+c)/d";
        System.out.println(InfixtoPostfix(exp));
    }
}
