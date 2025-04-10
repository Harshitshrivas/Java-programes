package Condition;
import java.util.Scanner;

public class study {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the button :");
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.print("Namaste");
            break;
            case 3: System.out.print("Hello");
            break;
            case 4: System.out.print("kay bada");
            break;
            default : System.out.print("Nikal bhai");
        }
        

    }
}
