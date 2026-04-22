
import java.util.Scanner;

public class checkpower2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num > 0 && (num & (num -1)) == 0) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
        sc.close();
        // A number that is a power of 2 has only one set bit in its binary representation. For example, 1 (2^0), 2 (2^1), 4 (2^2), 8 (2^3), etc.
        // The expression (num & (num - 1)) checks if there is only one set bit in num. If num is a power of 2, then num - 1 will have all bits set to the right of the single set bit in num, and the bitwise AND will result in 0.
        // For example, if num is 4 (100 in binary), then num - 1 is 3 (011 in binary). The bitwise AND of 4 and 3 is 0 (100 & 011 = 000), which confirms that 4 is a power of 2. If num is not a power of 2, the result will be non-zero.
    }
}
