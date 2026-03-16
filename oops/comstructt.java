
// class Student {

//     int age;
//     String name;

//     Student() {
//         System.out.println("Default Constuctor");
//     }

//     Student(int a, String s) {  // paramaterised constuctor
//         age = a;
//         name = s;
//     }

//     void display() {
//         System.out.println(name + " " + age);
//     }

// }

class Student {

    String name;
    int age;

    static int count = 0;

    static { // ya Constructor ka pehla chalego
        System.out.println("Student class loaded");
    }

    Student() {
        name = "Rajuu";
        age = 21;
        count++;
    }

    Student(String n, int a) {
        this.name = n;
        this.age = a;
        count++;
    }

    Student(String name) {
        this.name = name;
        age = 22;
        count++;
    }

    void dislplay() {
        System.out.println(name + " " + age);
    }

}

public class comstructt {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Kamal Hasan");
        Student S3 = new Student("Harshit", 21);

        s1.dislplay();
        s2.dislplay();
        S3.dislplay();

        System.out.println("Total Student: " + Student.count);
    }
}
