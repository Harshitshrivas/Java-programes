
import java.util.Stack;

public class Paranthesis {

    static  boolean isparanthesis(String s){

        Stack<Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){

        char ch = s.charAt(i);
        if( ch == '[' || ch == '{' || ch == '('){
            stack.push(ch);
        }else{
            if(stack.isEmpty()){
              return false;
            }

            else if(ch ==')' && stack.peek() != '(') return  false;
            else if(ch ==']'&& stack.peek() != '[')return  false;
            else if(ch == '}'&& stack.peek() != '{')return  false;

            else stack.pop();
        }
    }
     return stack.isEmpty();
    }
    public static void main(String[] args) {
        
      String s = "[{()}]";

   if(isparanthesis(s)){
    System.out.println("The Paranthesis is balanced");
   }else{
    System.out.println("The Paranthesis is not balanced");
   }

    }
}
