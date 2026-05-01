
public class rightangletraing {
    public static void main(String[] args) {
        int row = 4;
        int coloumn = 5;

        for(int i =1; i<=row; i++){
            for(int j = 1;j<=coloumn; j++){
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
