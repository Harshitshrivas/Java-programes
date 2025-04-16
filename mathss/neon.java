package mathss;
import java.util.*;
public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int square = num * num;
        int sum =0;

        while(square >0){
            sum += square % 10;
            square/=10;
        }

        if(sum == num){
            System.out.println(num + " is a neon number");
        }else{
            System.out.println(num + "is not a neon number");
        }
    }
}
