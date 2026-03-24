
import java.util.Stack;

class Pair {

   int val;
   int min;

   public Pair(int val, int min) {

      this.val = val;
      this.min = min;
   }
}

public class minstack {

   Stack<Pair> st = new Stack<>();

   public void push(int x) {

      if (st.isEmpty()) {
         st.push(new Pair(x, x));
      } else {
         int currentmin = Math.min(x, st.peek().min);
         st.push(new Pair(x, currentmin));
      }
   }

   public void pop() {
      if (!st.isEmpty()) {
         st.pop();
      }
   }

   public int top() {
      return st.peek().val;
   }

   public int getmin() {
      return st.peek().min;
   }

   public static void main(String[] args) {

      minstack ms = new minstack();
      ms.push(10);
      ms.push(40);
      ms.push(8);
      ms.push(50);
      ms.push(5);

      System.out.println( "Minimum in stack are: " + ms.getmin());
      System.out.println("Top of stack are: " + ms.top());
      ms.pop();
      System.out.println( "Minimum in stack are: " + ms.getmin());
      System.out.println("Top of stack are: " + ms.top());
   }
}
