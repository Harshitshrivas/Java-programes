package mathss;

public class factororillll {

   public static int factor(int n){
      if(n <= 1){
         return 1;
      }
      return n *factor(n-1);
   }
   public static void main(String[] args) {
      int num = 5;
      int ans = factor(num);
      System.out.println( "The factoriall of number is " + ans);
      
   } 
}
