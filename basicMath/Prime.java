
import java.util.Scanner;

public class Prime {

    public  static  boolean  isprime(int n){

        if(n<= 1){
            return  false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

      try ( Scanner sc = new Scanner(System.in); ){     // Scanner sc ko try ka andar likha sa warning ni aatii


        System.out.println("Enter a number to check prime or not:");   // number check karne ka liya 
        int n = sc.nextInt();
        if(isprime(n)){
            System.out.println(n + " is Prime number");
        }else{
            System.out.println(n + " is not Prime number");
        }
       
        System.out.print("Enter range: "); // prime number nikalne ka liya 
        int range = sc.nextInt();
        System.out.println("Prime numbers are:");
        for(int i =2; i<=range; i++){
            if(isprime(i)){
           System.out.print(i+ " ");
            }
        }    

      }
    }
}
