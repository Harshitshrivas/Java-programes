public class lemondachallenge {
    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 10, 20 };
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    System.out.println("False");
                    return;
                }
                five--;
                ten++;
            } else if (bill == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
