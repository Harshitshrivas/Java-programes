package Method;

public class sumnatural4 {
    static void summ(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
         sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        summ(5);
    }
}
