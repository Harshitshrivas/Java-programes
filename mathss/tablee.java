package mathss;
import java.util.*;
public class tablee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The table of : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
        System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
