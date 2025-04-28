package Method;

public class reversenum {
    static int reversee(int num){
        int reverse=0;

        while(num>0){
            int remainder = num%10;
            reverse = reverse * 10 + remainder;
            num /=10;
        }
        return reverse;
    }
    
    public static void main(String[] args) {
        int res = reversee(1234);
        System.out.println("The reverse num will be: " + res);

       

    }
}
