
class Animall {

    private int age;
    private String Name;

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.Name;
    }

    void setName(String Name) {
        this.Name = Name;
    }

    @SuppressWarnings("unused")
    void sound() {
        System.out.println("Animal make sound ");
    }
}

class Dogg extends Animall {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class inherittt {

    public static void main(String[] args) {
        Dogg dog = new Dogg();
        dog.setAge(5);
        dog.setName("Sheru");

        System.out.println("Dog ka naam: " + dog.getName());
        System.out.println("Dog ki age: " + dog.getAge());
        dog.sound();

    }
}
