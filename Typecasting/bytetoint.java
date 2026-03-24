public class bytetoint {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

        int res = a + b;
        System.out.println(res);

        int xx = 127;
        byte yy = (byte) xx;
        System.out.println("Byte: " + yy);

        int x = 130;
        byte y = (byte) x;
        System.out.println("Byte Overflow: " + y); //byte Range: -128 to 127

        System.out.println('A' + 1);  // 66 char ka hai
    }
}
