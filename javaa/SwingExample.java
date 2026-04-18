
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example..");
        JButton b = new JButton("Click Me!");
        b.setBounds(50, 50, 80, 60);
        frame.add(b);
      //frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
