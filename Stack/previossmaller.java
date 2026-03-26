
import java.util.Arrays;
import java.util.Stack;

public class previossmaller {

    public static int[] PreviosSmaller(int arr[]) {

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];

        for(int i =0; i<n; i++){

            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10, 8 };
        int res[] = PreviosSmaller(arr);
        System.out.println(Arrays.toString(res));

    }
}
