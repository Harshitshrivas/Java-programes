class Outerclass {
    int x = 10;

    void out() {
        System.out.println("Outer Class...");
    }

    class Innerclass {
        void show() {
            System.out.println("Inner Class  " + x);
        }
    }
}

public class innerclass {    //Member Inner Class (Non-static)
    public static void main(String[] args) {
        Outerclass obj = new Outerclass();
        obj.out();
        
        Outerclass.Innerclass obj2 = obj.new Innerclass();  // A class defined inside another class without static keyword.
        obj2.show();
    }
}
