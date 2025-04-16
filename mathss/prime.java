package mathss;
import java.util.*;
public class prime {

    public static boolean isprime(int num){
        if(num <= 1 )return false;
        for(int i=2; i * i<=num ; i++){
            if(num % i ==0) return false;
          
        }
        return true ;
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("The number was : ");
         int n = sc.nextInt();
        if(isprime(n)){
         System.out.println(n + " is prime ") ;
           }else {
         System.out.println(n + " is not prime ");
        }
     }
    }
    // easy method 
    //   boolean primee = true ;
    //   if(n <=1 ){ 
    //     primee = false;
    //   }else{
    //     for(int i=0; i<n /2; i++){
    //      if(n % 2 ==i){
    //         primee = false;
    //         break;
    //      }
    //     }
    //   }
    //   if(primee){
    //     System.out.println(n + " is prime");
    //   }else{
    //     System.out.println(n + " is not prime ");
    //   }


