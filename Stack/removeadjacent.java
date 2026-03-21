
import java.util.Stack;

public class removeadjacent {
    static String AdjaceString(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            } else {
                st.pop();
            }
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < st.size(); i++) {
            result.append(st.get(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
       System.out.println(AdjaceString(s));
     
    }
}
