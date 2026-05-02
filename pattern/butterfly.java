public class butterfly {
    public static void main(String[] args) {
        int row = 5;

        System.out.println("""
                Butterfly Pattern:
                """); // This is a multi-line string literal (text block) introduced in Java 15, which
                      // allows for easier formatting of multi-line strings. It preserves the line
                      // breaks and indentation as they appear in the code, making it ideal for
                      // displaying formatted text like this butterfly pattern title.
        // Upper part
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) { // Left star
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (row - i); k++) { // space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // rightstar
            }
            System.out.println();
        }

        // Lower Part

        for (int i = row - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) { // left star
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (row - i); k++) { // space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // rightstar
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
