package mathss;
import java.util.*;
public class summm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum=0;

        while(num>0){
            sum += num %10;
            num/=10;
        }
        System.out.println("The sum of digit is :" + sum);
    }
}
