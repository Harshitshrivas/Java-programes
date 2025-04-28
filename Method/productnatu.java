package Method;

public class productnatu {
    static int product(int n){
        int mul=1;
        for(int i=1; i<=n; i++){
          mul*=i;
        }
        return mul;
    }
    public static void main(String[] args) {
      int res= product(5);
      System.out.println(res);
    }
}
