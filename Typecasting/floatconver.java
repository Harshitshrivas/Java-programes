public class floatconver {
    public static void main(String[] args) {

        float f = 65.77f;
        double d = f; // Widening (Implict)
        int a = (int) f;
        byte b = (byte) f;
        short s = (short) f;
        char c = (char) f;

        System.out.println("Float to Double: " + d);
        System.out.println("Float to Integer: " + a);
        System.out.println("Float to Byte: " + b);
        System.out.println("Float to Short: " + s);
        System.out.println("Float to  char : " + c);
    }
}
