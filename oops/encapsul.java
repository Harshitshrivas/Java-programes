
class Carr {

    @SuppressWarnings("FieldMayBeFinal")
    private int year;
    @SuppressWarnings("FieldMayBeFinal")
    private String company;
    private int speed;
    private String colour;
    private String Model;

    // getter and setter
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColur() {
        return colour;
    }

    // setter
    public void setSpeed(int speed) {
        if(speed > 0){
            this.speed = speed;
        }
      //  this.speed = speed;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    // getter
    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return Model;
    }

    // set Company aur set year ni karega bus get karega taki vo koi change na karde

    public Carr(int year, String company) { // Constructr sa create kar diyeeee
        this.year = year;
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public String getComapany() {
        return company;
    }

}

public class encapsul {
    public static void main(String[] args) {

        Carr c1 = new Carr(2008, "Toyoto");
        // Setting Values
        c1.setColour("Black");
        c1.setSpeed(120);
        c1.setModel("Fortuner");

        // getting values
        System.out.println("Year of car is: " + c1.getYear());
        System.out.println("Speed of car is: " + c1.getSpeed());
        System.out.println("Colour of car is: " + c1.getColur());
        System.out.println("Model of car is: " + c1.getModel());
        System.out.println("Company of car is: " + c1.getComapany());
    }
}
