
import java.util.Stack;

public class prefixtopostfix {

    static String PrefixToPostfix(String s){
        Stack<String> st = new Stack<>();

        for(int i = s.length() -1; i>=0; i--){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(ch + "");
            }else{
                String op1 = st.pop();
                String op2 = st.pop();
                String combined = op1 + op2 + ch;
                st.push(combined);
                        }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        System.out.println("Postfix: " + PrefixToPostfix(s));
    }
}
