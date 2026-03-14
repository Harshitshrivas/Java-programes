class Animallll {

    private int age;
    private String Name;
    private String breed;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void eatt() { // ya sab chije sab animal karte ha sab animal ka naam , bread , age aur khana
                  // khate ha isliya inko parent class ma rakh ke sab animals mai extend kar lega;
        System.out.println("Animal is eating......");
    }

    @SuppressWarnings("unused")
    void sound() {
        System.out.println("Animal Make soundd....");
    }
}

class Dogy extends Animallll {

    @Override
    void sound() {
        System.out.println("Dog Barks..");
    }

    void guard() {
        System.out.println("Dog is guarding the house");
    }
}

class Caty extends Animallll {

    @Override
    void sound() {
        System.out.println("Cat Meow..");
    }

    void climb() {
        System.out.println("Cat Climb trees");
    }
}

public class hierarical {
    public static void main(String[] args) {

        Dogy dog = new Dogy();
        dog.setAge(6);
        dog.setName("Jimmy");
        dog.setBreed("Lebra");

        System.out.println("Dog Name is: " + dog.getName());
        System.out.println("Dog age: " + dog.getAge());
        System.out.println("Dog breed: " + dog.getBreed());

        dog.eatt();
        dog.sound();
        dog.guard();

        System.out.println("----------------");

        Caty cat = new Caty();
        cat.setAge(3);
        cat.setName("Max");
        cat.setBreed("Persion");

        System.out.println("Cat Name is : " + cat.getName());
        System.out.println("Cat age: " + cat.getAge());
        System.out.println("Cat breed: " + cat.getBreed());

        cat.eatt();
        dog.sound();
        cat.climb();

    }
}
