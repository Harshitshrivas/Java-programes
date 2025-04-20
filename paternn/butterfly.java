package paternn;

public class butterfly {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j=0; j<=space; j++){
                System.out.print(" ");
            }
            for(int p=0; p<=i; p++){
                System.out.print("*");
            }System.out.println( );
        }
        for(int i=n; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j=0; j<=space; j++){
                System.out.print(" ");
            }
            for(int p=0; p<=i; p++){
                System.out.print("*");
            }System.out.println( );
        }
    }
}
