
import java.util.Stack;

public class frameworkk {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack: " + st);

        st.pop();
        System.out.println("After removing last element: " + st);
        System.out.println("The top of stack is " + st.peek());
        System.out.println("Is Empty: " + st.empty());
        System.out.println("The postion of stack 10 is: " + st.search(10));
        System.out.println("The Size of stack is: " + st.size());
        System.out.println("Stack contaion 20: " + st.contains(20));
        System.out.println("First element: " + st.firstElement());
        System.out.println("Last element: " + st.lastElement());

        System.out.println("Reverse of Stack is: ");
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
        System.out.println();
    }
}
