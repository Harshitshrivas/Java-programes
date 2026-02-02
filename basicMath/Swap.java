public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
         int temp = a;
         a = b;
         b = temp;
        
        // Swapping without using a temporary variable (using XOR)
         a = a^b;
         b = a^b;
         a=a^b;
        
        // Swapping without using a temporary variable (using addition and subtraction)
         a= a +b;
         b = a-b;
         a = a-b;


        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
