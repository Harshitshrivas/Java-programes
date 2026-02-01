public class numreverse {
    public static void main(String[] args) {
        
        int n = 123456;
        int reverse = 0;

        while(n > 0){
        int remainder = n %10;
        reverse = reverse * 10 + remainder;
        n /=10;
        }
        System.out.println("The Reverse num is "+ reverse);
    }
}
