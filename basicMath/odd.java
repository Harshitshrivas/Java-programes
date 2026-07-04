
import java.util.Scanner;

public class odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Odd and even numbers from 1 to " + num + " are: ");

        for (int i = 1; i <= num; i++) { // ek sath odd aur even dono print karne ke liye
            if (i % 2 == 0) {
                System.out.println("Even " + i);
            } else {
                System.out.println("Odd " + i);
            }
        }

        // optimal aproch for odd and even number check
        System.out.println("Enter a number to check odd or even: ");
        if((num & 1) == 0){
            System.out.println(num + " is Even...");
        }else{
            System.out.println(num + " is Odd..");
        }

    }
}
