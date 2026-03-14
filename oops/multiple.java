interface Landvehicle{
   default void landinfo(){
        System.out.println("The Vehicle is running on Road.. ");
    }
}
interface Watervehicle{
    default void waterinfo(){
        System.out.println("The Ships is runningon water");
    }
}

class Vehcle implements Landvehicle , Watervehicle{

    public  Vehcle(){
        System.out.println("Two types of vehcle..");
    }
}
public class multiple {
    public static void main(String[] args) {
        
        Vehcle v = new Vehcle();
        v.landinfo();
        v.waterinfo();
        
    }
}
