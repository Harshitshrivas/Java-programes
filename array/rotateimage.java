public class rotateimage {

    static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) { // Transpose
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        rotateMatrix(matrix);
        // Print the rotated matrix
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
