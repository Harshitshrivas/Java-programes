
import java.util.HashSet;

public class containduplicat {
    public static boolean duplicate(int num[] , int k){
        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i<num.length; i++){
            if(set.contains(num[i])){
                return true;
            }
            set.add(num[i]);

            if(set.size() > k){
                set.remove(num[i - k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1 , 2, 3, 1};
        int k = 3;
        System.out.println(duplicate(num, k));

    }
}
