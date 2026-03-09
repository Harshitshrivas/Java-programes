import java.io.FileReader;
import java.io.IOException;

public class throw_throwss {

    public static void readFile(String filename) throws IOException { // Method mai lagke pehla hii bata deta ha
                                                                      // exception kar sakta ha

        @SuppressWarnings("unused")
        FileReader file = new FileReader(filename);

    }

    public static void main(String[] args) {

        // Example pf throw
        int age = 15;
        if (age < 18) {
            // throw new ArithmeticException("Not eligible for voting");
            System.out.println("Not eligible");
        }
        System.out.println("Eligible");

        // throws
        try {
            readFile("text.txt");
        } catch (IOException e) {
            System.out.println("File Not Found :  " + e.getMessage());
        }

    }
}
