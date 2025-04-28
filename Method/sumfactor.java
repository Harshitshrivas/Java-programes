package Method;

public class sumfactor {
    static int factor(int num){
        int sum=0;
        for(int i=1; i<=num; i++){
            if( num%i==0){                       // sum
               sum+=i;
            }
        }
        return sum;
    }

    static int factorr(int num){
        int count=0;
        for(int i=1; i<=num; i++){
            if( num%i==0){
               count++;
            }                                    // count
        }
        return count;
    }
    public static void main(String[] args) {
        int res= factor(10);
        System.out.println(res);

        int countt = factorr(10);
        System.out.println(countt);
    }
}
