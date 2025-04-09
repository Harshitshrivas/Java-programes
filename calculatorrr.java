package practicee;
import java.util.*;

public class calculatorrr {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number a : ");
     int a = sc.nextInt();
     System.out.println("Enter number b:");
     int b = sc.nextInt();
     System.out.println("Enter the operation : ");
     char c = sc.next().charAt(0);

     switch (c) {
        case '+':
        System.out.print("The addition of a and b are :" + a + b);
            break;
            case '-':
        System.out.print("The subtarction of a and b are: " );
        System.out.print(a-b);
            break;
            case '*':
        System.out.print("The multiplication of a and b are : " + a * b);
            break;
            case '%':
            System.out.print("The module of a and b are : " + a % b);
                break;    
     
        default:
        System.out.println("Invalid number");
            break;
     }

    }
}
