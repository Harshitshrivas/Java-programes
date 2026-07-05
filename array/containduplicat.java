
import java.util.HashMap;

public class containduplicat {
    public static boolean duplicate(int num[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                int previndex = map.get(num[i]);
                if (i - previndex <= k) {
                    return true;
                }
            }
            map.put(num[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(duplicate(num, k));

    }
}
