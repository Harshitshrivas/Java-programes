import java.util.Stack;

public class minstack2 {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public void push(int x) {

        st.push(x);

        if (minSt.isEmpty() || x <= minSt.peek()) {
            minSt.push(x);
        }
    }

    public void pop() {

        if (st.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }

    public static void main(String[] args) {
     minstack2 mst = new minstack2();

     mst.push(10);
     mst.push(5);
     mst.push(20);
     mst.push(30);
     mst.push(2);

     System.out.println("Minimum Stack are: " + mst.getMin());
     System.out.println("Top are: " + mst.top());
     mst.pop();
        System.out.println("Minimum Stack are: " + mst.getMin());
     System.out.println("Top are: " + mst.top());
     
    }
}
