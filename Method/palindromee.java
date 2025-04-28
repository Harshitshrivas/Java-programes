package Method;

public class palindromee {
    static boolean reversee(int num){
        int reverse=0;
         int original = num;
        while(num>0){
            int remainder = num%10;
            reverse = reverse * 10 + remainder;
            num /=10;
        }
        return reverse==original;
    }
    public static void main(String[] args) {
        System.out.println( "It is Plaindrome :" + reversee(121));
    }
}
