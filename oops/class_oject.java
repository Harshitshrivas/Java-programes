
    class Car{
        int speed;
        String Company;

        void drive(){
            System.out.println("Company of car is " + Company );
            System.out.println("Speed of Car is  " + speed  + " km/h");
            System.out.println("Car is running....");
        }
    }

public class class_oject {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.Company = "BMW";
        c1.speed = 120;
        c1.drive();

    }
}
