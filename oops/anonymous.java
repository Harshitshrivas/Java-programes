
abstract class Animaal {
    abstract void soound();
}

public class anonymous {
    public static void main(String[] args) {
        Animaal dog = new Animaal() {

            @Override
            void soound() {
                System.out.println("bhaw bhaw");
            }

        };
        dog.soound();  // A class without a name used for one-time use.
    }
}
