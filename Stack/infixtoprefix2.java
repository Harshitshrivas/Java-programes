import java.util.Stack;

public class infixtoprefix2 {

    static int prece(char c) {

        // if (ch == '^') {
        // return 3;
        // } else if (ch == '*' || ch == '/') {
        // return 2;
        // } else if (ch == '+' || ch == '-') {
        // return 1;
        // } else {
        // return -1;
        // }

        return switch (c) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };

    }

    static String Infixtoprefix(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                res.append(ch);
            } else if (ch == ')') {
                st.push(ch);
            } else if (ch == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    res.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty()
                        && (prece(ch) < prece(st.peek()) || (prece(ch) == prece(st.peek()) && ch == '^'))) {
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String exp = "a*(b+c)/d";

        System.out.println(Infixtoprefix(exp));

    }
}
