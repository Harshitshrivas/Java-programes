import java.util.Stack;

public class reversess {
    public static void main(String[] args) {
    
         Stack<Integer> st = new Stack<>();
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
         st.push(50);
         System.out.println("Original Stack: " + st);

        Stack<Integer> revere = new Stack<>();
        while(!st.isEmpty()){
            revere.push(st.pop());
        }
          System.out.println("Reversed Stack: " + revere);
    }
}
