
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cobinationsum2 {
    static void combinesum(int i, int arr[], int target, List<Integer> list, List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (i == arr.length || target < 0) {
            return;
        }

        list.add(arr[i]);
        combinesum(i + 1, arr, target - arr[i], list, res);
        list.remove(list.size() - 1);
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) { // agar current element aur next element same hai, to index
                                                             // ko 1 se badhana chahiye, taki next element ko add kiya
                                                             // ja sake, duplicate element ko skip karna chahiye, taki
                                                             // final answer me duplicate combination na aaye, aur index
                                                             // ko 1 se badhana chahiye, taki next element ko add kiya
                                                             // ja sake
            i++;
        }

        combinesum(i + 1, arr, target, list, res);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        combinesum(0, arr, target, new ArrayList<>(), res);
        System.out.println(res);

    }
}
