
abstract class TV {

    String Brand;
    int volume;

    TV(String Brand) { // Constructor
        this.Brand = Brand;
        this.volume = 10;
        System.out.println("TV Constructor Called: " + Brand);
    }

    // Abstract methods (must be implemented by child class)
    abstract void turnOn();

    abstract void turnoff();

    abstract void changeChannel(int channel);

    // Concrete method
    void increaseVolume() {
        volume++;
        System.out.println("Volume of Tv is: " + volume);
    }

    void decreaseVolume() {
        volume--;
        System.out.println("Volume Decreased: " + volume);
    }

    void displaybrand() {
        System.out.println("TV Brand: " + Brand);
    }
}

class Remote extends TV {

    @SuppressWarnings("unused")
    Remote(String Brand) {
        super(Brand);
    }

    // Implement abstract methods
    @Override
    void turnOn() {
        System.out.println("TV is ON Now....");
    }

    @Override
    void turnoff() {
        System.out.println("Tv will be OF....");
    }

    @Override
    void changeChannel(int channel) {
        System.out.println("Channel changed to: " + channel);
    }
}

public class abstractionn {
    public static void main(String[] args) {
        TV remote = new Remote("Panasonic");

        remote.displaybrand();
        remote.turnOn();
        remote.changeChannel(102);

        remote.increaseVolume();
        remote.decreaseVolume();

        remote.turnoff();

    }
}
