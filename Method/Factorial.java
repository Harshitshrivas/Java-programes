package Method;

public class Factorial {
    static int Factor(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *=i;
        }
        return fact;
    }
   public static void main(String[] args) {
    int res = Factor(5);
    System.out.println(res);
   } 
}
