package mathss;
import java.util.*;

public class reversedd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num ");
        int num = sc.nextInt();
        int reverse =0;

        while(num >0){
            int remainder = num%10;
            reverse = reverse * 10 + remainder;
            num/=10;
        }

        System.out.println("The reverse number is " + reverse);
    }
}
