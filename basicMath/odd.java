
import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        
            if(num % 2 == 0){
                System.out.println("Even " + num);
            }else{
                System.out.println("Odd " + num);
            }
        
    }
}
