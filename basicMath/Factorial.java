public class Factorial {

    // Recursive method to calculate factorial
    static  int factoriall(int n ){
       
        if(n<=1){
            return 1;
        }

        return  n * factoriall(n-1);
    }
    public static void main(String[] args) {
        int num = 5;

        // Calculate factorial by iterative method
        // int fact =1;
        // for(int i =1; i<=num; i++){
        //     fact *=i;
        // }
        // System.out.println("The Factorial is "+ fact);

        System.out.println(factoriall(num));
    }
}
