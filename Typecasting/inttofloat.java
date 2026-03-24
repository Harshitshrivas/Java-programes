public class inttofloat {
    public static void main(String[] args) {
        int a = 12;
        float b = a;  // implicit

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);

        float x = 5.7f;
        int y = (int) x;   // explicit

        System.out.println("Float: " + x);
        System.out.println("Integer: " + y);

    }
}
