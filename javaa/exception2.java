
public class exception2 {

    public static int divide(int a, int b) {

        try {
            return a / b;
        } catch (ArithmeticException e) {

            System.out.println(e);
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] numerater = { 10, 28, 30, 40, 55 };
        int[] denominator = { 1, 2, 0, 4, 5 };

        for (int i = 0; i < numerater.length; i++) {
            System.out.println(divide(numerater[i], denominator[i]));
        }
        System.out.println("Good job");
    }
}
