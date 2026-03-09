public class exception {
    public static void main(String[] args) {
       
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Ya tooo hamesha run hogaaa");
        }

        System.out.println("Exception Handling");
    }
}
