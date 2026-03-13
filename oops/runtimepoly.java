
class Animal {

    void sound() {
        System.out.println("Animal makes sound");

    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bhawwww bhawww");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meowww meowww ghopp ghop ghop ......");

    }
}

public class runtimepoly {
    public static void main(String[] args) {

        Animal a;

        a = new Animal();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Dog();
        a.sound();

    }
}
