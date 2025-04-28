package Method;

public class countdigit9 {
    static int counttt(int num){
        int count=0;
        while(num>0){
           count++;
           num/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int res = counttt(12345);
        System.out.println(res);
    }
}
