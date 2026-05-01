public class hollowsquar {
    public static void main(String[] args) {
        int row = 5;
        int coloumn = 6;

        for(int i =1; i<=row; i++){
            for(int j = 1;j<=coloumn; j++){
                if(i == 1 || i == row || j == 1|| j == coloumn){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
