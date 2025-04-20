package paternn;
import java.util.*;
public class rhom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int p=1; p<=n; p++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
