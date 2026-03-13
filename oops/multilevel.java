
class Grandparent {

    private int age;
    private String name;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void pension() {
        System.out.println("Kamaiiiiii dada ki pension");
    }

    @SuppressWarnings("unused")
    void eyes() {
        System.out.println("Black eyes");
    }

}

class Parent extends Grandparent {

    void naukri() {
        System.out.println("Teacher");
    }

    @SuppressWarnings("override")
    void eyes() {
        System.out.println("");
    }

}

class Child extends Parent {

    void job() {
        System.out.println("Computer Engineer");
    }

    @Override
    void eyes() {
        System.out.println("Black eyes");
    }

}

public class multilevel {
    public static void main(String[] args) {

        Child ch = new Child(); // child ka object
        ch.setAge(20);
        ch.setName("Harshu");

        System.out.println(ch.getAge());
        System.out.println(ch.getName());
        ch.job();
        ch.naukri();
        ch.pension();
        ch.eyes();

        Grandparent gp = new Grandparent();
        gp.setAge(70);
        gp.setName("Badri");

        Parent p = new Parent();
        p.setAge(45);
        p.setName("Santosh");

        System.out.println("Grandparent: " + gp.getName() + " " + gp.getAge());
        System.out.println("Parent: " + p.getName() + " " + p.getAge());

    }
}
