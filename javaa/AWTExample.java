
import java.awt.Button;
import java.awt.Frame;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example.");
        Button b = new Button("Click Me");

        b.setBounds(50, 50, 80, 60);
        frame.add(b);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
