
import java.util.Scanner;

public class Stringpalind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a string....");
        String str1 = sc.nextLine();
        String str2 = "";
        
        for(int i = str1.length()-1 ; i>=0 ; i--){
            str2 = str2 + str1.charAt(i);
        }

        if(str1.equals(str2)){
            System.out.println("String is plaindrome ");
        }else{
            System.out.println("String is nottt");
        }
    }
}
