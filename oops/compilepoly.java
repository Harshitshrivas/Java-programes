
class Calculte {     // Complile time polymorphishm (Method overloading) ek methoda ka naam ka many form par sabke parameter alag

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class compilepoly {
    public static void main(String[] args) {

        Calculte c1 = new Calculte();
        System.out.println(c1.add(5, 5));
        System.out.println(c1.add(10, 40, 50));
        System.out.println(c1.add(5.5, 10.0));

    }
}
