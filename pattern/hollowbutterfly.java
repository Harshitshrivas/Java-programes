public class hollowbutterfly {
    public static void main(String[] args) {

        int row = 6;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) { // Left star
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2 * (row - i); k++) { // space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower Part

        for (int i = row - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) { // left star
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2 * (row - i); k++) { // space
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // rightstar
                if (k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
