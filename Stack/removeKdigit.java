import java.util.Stack;

public class removeKdigit {

    public static String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for (char digit : num.toCharArray()) {

            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }
            st.push(digit);
        }

        while (k > 0 && !st.isEmpty()) { // last value ko delete karne ager kuch ni hui too lAST SA k value delete
                                         // kardega
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse(); // Reverse to get the correct order

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0); // Remove leading zeros
        }

        // Handle edge case where result might be empty
        if (sb.length() == 0) {
            return "0";
        } else {
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        String result = removeKdigits(num, k);
        System.out.println(result);
    }
}
