package paternn;

public class revpyramid {
   public static void main(String[] args) {
    int n=5;
    for(int i=0; i<=n; i++){
        for(int j=0; j<=i; j++){
            System.out.print(" ");
        }
        for(int p=n; p>=i; p--){
            System.out.print("*");
        }
        for(int p=n; p>=i; p--){
            System.out.print("*");
        }
        System.out.println();
    }
   } 
}
