public class checkdivisibiltybysumanddigit {

    public static boolean checkdivisibilty(int num){
        int originalnum = num;
        int digitsum = 0;
        int digitproduct = 1;

        while(num != 0){
            int digit = num % 10;

            digitsum += digit;
            digitproduct *= digit;

            num /= 10;
        }
        int totalsum = digitsum + digitproduct;
        
        return originalnum % totalsum == 0;
    }
    public static void main(String[] args) {
        int num = 99;
       System.out.println(checkdivisibilty(num));
    }
}
