public class SumNnum {
    static  int Sum(int n){
        if(n ==0){
            return 0;
        }
        return n + Sum(n-1) ; // we will add n to the sum of first n-1 numbers, this way we will get the sum of first n numbers
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " numbers is: " + Sum(n));
        
    }
}
