
import java.util.Arrays;

public class bootsave {
    public static void main(String[] args) {
        int [] peeple = {3, 2, 2, 1};
        int limit = 3;
        int count = 0;
        Arrays.sort(peeple);
        int i = 0, j = peeple.length-1;

        while( i<= j){
            if(peeple[i] + peeple[j] <= limit){  // if the lightest and heaviest person can share a boat
                i ++;
                j--;
            }else{
                j--;
                
            }
            count++;    // we need a boat for the heaviest person, whether they share or not
        }
        System.out.println("count of boats needed: " + count);
    }
}
