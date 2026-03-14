
interface SoundRecoder {

    void recordsound();
}

interface Camera {

    void photo();
}

interface Strorage {

    void savefile(String Filename);
}

class Moble implements SoundRecoder, Camera, Strorage {

    @Override
    public void photo() {
        System.out.println("Photo Captured..");
    }

    @Override
    public void savefile(String Filename) {
        System.out.println(Filename + " Saved in Stroge...");
    }

    @Override
    public void recordsound() {
        System.out.println("Recording Sound...");
    }
}

public class interfacee {
    public static void main(String[] args) {
        Moble m1 = new Moble();
        m1.recordsound();
        m1.photo();
        m1.savefile("Harshit.pdf");

    }
}
