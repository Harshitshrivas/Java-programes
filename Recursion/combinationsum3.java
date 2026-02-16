import java.util.ArrayList;
import java.util.List;

public class combinationsum3 {

    static void combine(int start, int k, int target, List<Integer> list, List<List<Integer>> res) {

        if (target == 0 && list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || list.size() > k) { // agar target 0 se chhota hai, to valid combination nahi hai, aur agar
                                             // list ka size k se bada hai, to valid combination nahi hai, isliye dono
                                             // condition me return karna chahiye, taki aage ki recursion na chale, aur
                                             // target 0 hone par list ka size k ke barabar hona chahiye, taki valid
                                             // combination mil sake
            return;
        }
        for (int i = start; i <= 9; i++) {
            list.add(i);
            combine(i + 1, k, target - i, list, res);
            list.remove(list.size() - 1);
        }
    }

    public static List<List<Integer>> CombinationSum(int k, int target) {

        List<List<Integer>> res = new ArrayList<>();
        combine(1, k, target, new ArrayList<>(), res);
        return res;

    }

    public static void main(String[] args) {
        int k = 3;
        int target = 9;
        List<List<Integer>> ans = CombinationSum(k, target);
        System.out.println(ans);
    }
}
