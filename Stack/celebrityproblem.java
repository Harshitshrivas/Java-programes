import java.util.Stack;

public class celebrityproblem {

    static int findCelebrity(int[][] m) {

        int n = m.length;
        Stack<Integer> st = new Stack<>();

        // Step 1: Push all people
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: Find possible celebrity
        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            if (m[a][b] == 1) {
                // a knows b
                // a cannot be celebrity
                st.push(b);
            } else {
                // a does not know b
                // b cannot be celebrity
                st.push(a);
            }
        }

        int candidate = st.pop();

        // Step 3: Verify candidate

        // Candidate should know nobody
        for (int i = 0; i < n; i++) {
            if (m[candidate][i] == 1) {
                return -1;
            }
        }

        // Everyone should know candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate && m[i][candidate] == 0) {
                return -1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[][] M = {
                { 0, 1, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 1, 1, 0 }
        };

        int ans = findCelebrity(M);

        if (ans == -1) {
            System.out.println("No Celebraty");
        } else {
            System.out.println("Celebrity: " + ans);
        }

    }
}