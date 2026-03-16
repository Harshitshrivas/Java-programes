
class Student {

    int age;
    String name;

    Student() {
        System.out.println("Default Constuctor");
    }

    Student(int a, String s) {  // paramaterised constuctor
        age = a;
        name = s;
    }

    void display() {
        System.out.println(name + " " + age);
    }

}

public class comstructt {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(21, "Harshit");
        s2.display();
    }
}
