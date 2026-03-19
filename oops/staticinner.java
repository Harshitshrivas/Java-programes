class Outerclas {
    static int x = 10;

    void out() {
        System.out.println("Outer Class...");
    }

    static class Innerclas {
        void show() {
            // Outerclass obj = new Outerclass();  // create outer object
            // obj.out();   // calling outer method

            System.out.println("Inner Class  " + x); // Static nested class can access only static members of outer
                                                     // class.
        }
    }
}

public class staticinner {
    public static void main(String[] args) {
        Outerclas obj = new Outerclas();
        obj.out();

        Outerclas.Innerclas obj2 = new Outerclas.Innerclas(); // A static nested class is used when the inner class does
                                                              // not need access to non-static members of the outer
                                                              // class.
        obj2.show();
        
    }
}
