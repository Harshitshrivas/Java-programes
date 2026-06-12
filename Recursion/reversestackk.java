import java.util.Stack;

public class reversestackk {
    public static void insertAtBottom(Stack<Integer> st  , int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        int top = st.pop(); // we will pop the top element of the stack and store it in a variable
        

    }
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top  = stack.pop(); // we will pop the top element of the stack and store it in a variable
        reverseStack(stack); // we will call the reverseStack function recursively to reverse the remaining stack
        insertAtBottom(stack, top); // we will insert the popped element at the bottom of the stack

    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
