
import java.util.Stack;

public class stockspam {

    public static void maxProfit(int[] prices) {

        Stack<int[]> st = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int span = 1;
            while (!st.isEmpty() && st.peek()[0] <= price) {
                span += st.peek()[1];
                st.pop();
            }
            st.push(new int[] { price, span });
            System.out.print(span + " ");
        }
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
         System.out.println("The stock span for the given prices is: ");
        maxProfit(prices);

    }
}
