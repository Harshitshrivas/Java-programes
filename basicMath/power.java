public class power {

    static double myPow(double x, int n){

        long b = n;

        if(b< 0){    // negative power ke liye
            x = 1/x;
            b = -b;  // negative power ko positive me convert karna chahiye, kyunki hum b ko 2 ke power ke form me represent kar rahe hai, aur har iteration me b ko 2 se divide karna chahiye

        }

        double answer = 1;  // answer ko 1 se initialize karna chahiye, kyunki multiplication ke liye identity element 1 hota hai

        while(b > 0){
            if(b%2 == 1){     // agar b odd hai to answer ko x se multiply karna chahiye
             answer *= x;
            }
            x= x*x;        // x ko x se multiply karna chahiye, kyunki agar b even hai to answer ko x^2 se multiply karna chahiye
            b = b/2;      // b ko 2 se divide karna chahiye, kyunki hum b ko 2 ke power ke form me represent kar rahe hai, aur   har iteration me b ko 2 se divide karna chahiye
        }
        return answer;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        double result = myPow(x, n);
        System.out.println(result);
            x = 2;
            n = -2;
            result = myPow(x, n);
            System.out.println(result);

    }
}
