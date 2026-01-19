
import java.util.Scanner;
public class Palindrome {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while (n >0){
          int remainder = n%10;
          reverse = reverse * 10 + remainder;
          n/=10;
        }

        if(original == reverse){
            System.out.println("The number is plaindrome ");
        }else{
            System.out.println("The number is nottt palindrome");
        }
    }
}



