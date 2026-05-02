public class numpyramid {
    public static void main(String[] args) {
        int row = 6;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) { // Print spaces for alignment
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // Print the numbers in increasing order
                System.out.print(k);
            }
            for (int k = i - 1; k >= 1; k--) {  // Print the numbers in decreasing order
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
