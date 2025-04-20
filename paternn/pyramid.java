package paternn;

public class pyramid {
    public static void main(String[] args) {
        int n=6;
        for(int i=0; i<=n; i++){
          for(int j=0; j<=n-i; j++){
            System.out.print(" ");
          }
          for(int k=0; k<=i; k++){
            System.out.print("*");
          }
          for(int p=0; p<=i; p++){
            System.out.print("*");
          }System.out.println( );
        }
    }
}
