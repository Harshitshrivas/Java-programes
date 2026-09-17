public class minAdd {
    public static void main(String[] args) {
        String str = "()(";
        int open = 0;
        int mismatch = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            } else {

                if (open > 0) {
                    open--;
                } else {
                    mismatch++;
                }
            }
        }
        int ans = open + mismatch;
        System.out.println("Minimum additions needed: " + ans);
    }
}
