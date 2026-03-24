public class Stringconver {
    public static void main(String[] args) {

        String s = "123";
        int a = Integer.parseInt(s);
        double d = Double.parseDouble(s);
        float f = Float.parseFloat(s);
        System.out.println("String to Integer: " + a);
        System.out.println("String to Double: " + d);
        System.out.println("String to Float: " + f);

        double x = 9.789d;
        String val = String.valueOf(x);
        System.out.println("Double to String: " + val);

        float xx = 5.7f;
        String vall = String.valueOf(xx);
        System.out.println("Float to String: " + vall);

    }
}
