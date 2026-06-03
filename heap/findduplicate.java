
import java.util.HashSet;

public class findduplicate {
    public static void main(String[] args) {
        int num[] = { 1, 2, 2, 3, 3, 3, 4, 5, 6, 6 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (!set.add(num[i])) {
                System.out.println(num[i]);
            }
        }
    }
}
