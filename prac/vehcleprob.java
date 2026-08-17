/*  given :- Total no of vehcles = v 
   Total no of whells = w

   To find :- Total no of 2 whellers and 4 whellers
   ex :- v = 10, w = 28
  x =  2 whellers = 6,  y = 4 whellers = 4
  equation :-
  x + y = v  
  2x + 4y = w
   Derivation of equation :-
   x + y = v
   y = v - x

  2x + 4y = w
  2x + 4(v - x) = w
  2x + 4v - 4x = w
  4v - 2x = w
  2x = 4v - w
  x = (4v - w) / 2

*/

public class vehcleprob {
    public static void main(String[] args) {
        int v = 10; // total no of vehcles
        int w = 28; // total no of whells

       if (v <= 0 || w < 2 * v || w > 4 * v || w % 2 != 0) {  
            System.out.println("Invalid input");
        } else {

            int x = (4 * v - w) / 2; // 2-wheelers
            int y = v - x;            // 4-wheelers

            System.out.println("Number of 2-wheelers: " + x);
            System.out.println("Number of 4-wheelers: " + y);
        }
    }
}
