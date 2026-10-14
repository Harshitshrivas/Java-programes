public class maxsumsquare {

    static String maxSumOfSquares(int num, int sum) {

        if (sum > num * 9) {
            return "";
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (sum >= 9) {
                ans.append(9);
                sum -= 9;
            } else {
                ans.append(sum);
                sum = 0;

            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        int num = 2;
        int sum = 3;
        System.out.println(maxSumOfSquares(num, sum));
    }
}
