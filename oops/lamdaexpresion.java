
interface Demoano {
    void meth1();   // No Parameter
}

interface Denmo {   // Multiple Parameters
    int addd(int a, int b);
}

interface Square {   // Single Parameter
    int calc(int x);
}

// class harsh implements Demoano{ // ya lamba process ha
// @Override
// public void meth1() {
// System.out.println("I am method 1...");
// }
// }

public class lamdaexpresion {
    public static void main(String[] args) {

        Demoano obj = () -> { /// ya lamda expresion , chota process
            System.out.println("I am Method 1");
        };
        obj.meth1();

        Denmo obj2 = (a, b) -> {
            return a + b;
        };
        System.out.println("The addition of a and b are:  " + obj2.addd(5, 5));

        Square obj3 = (x) -> x * x;
        System.out.println("Square: " + obj3.calc(4));
    }
}
