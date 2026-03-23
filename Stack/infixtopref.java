import java.util.Stack;

public class infixtopref {

    static int precedence(char c) {

        return switch (c) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }

    static String InfixtoPrefix(String s) {

        // 1. Reverse string
        StringBuilder input = new StringBuilder(s);
        input.reverse();

        // 2. Swap brackets
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                input.setCharAt(i, ')');
            } else if (input.charAt(i) == ')') {
                input.setCharAt(i, '(');
            }
        }

        // 3. Infix → Postfix
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                res.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop();
            } else {

                while (!st.isEmpty() && precedence(ch) < precedence(st.peek())) {
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        // 4. Reverse final result
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String exp = "(a-b/c)*(a/k-l)";
        System.out.println(InfixtoPrefix(exp));
    }
}
