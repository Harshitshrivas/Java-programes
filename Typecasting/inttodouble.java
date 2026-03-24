
public class inttodouble {
    public static void main(String[] args) {
        int a = 9;
        double b = a;   // Implicit

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);

        double x = 9.789d;
        int y = (int) x;    // Explicit
        
        System.out.println("Double: " + x);
        System.out.println("Integer: " + y);
    }
}
