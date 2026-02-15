import java.util.ArrayList;
import java.util.List;

public class Combinationsum {
    static void combinesum(int i ,int arr[] ,int target  , List<Integer> list , List<List<Integer>> res) {

        if(target == 0){
            res.add(new ArrayList<>(list));    // list me se current combination ko res me add karna chahiye, kyunki target 0 hone par current combination valid ho jata hai, aur current combination ko res me add karna chahiye, taki final answer me current combination bhi aa jaye, aur target ko 0 hone par                       
            return;
        }
        if( i == arr.length || target < 0 ){
            return;
        }

        list.add(arr[i]);
        combinesum(i, arr, target - arr[i], list, res);
        list.remove(list.size() - 1);    // list me se last element remove karna chahiye, kyunki current element ko add karne ke baad target ko current element se minus karna chahiye, aur current element ko add karne ke baad list me se current element ko remove karna chahiye, taki next element ko add kiya ja sake, aur index ko 1 se badhana chahiye, taki next element ko add kiya ja sake
        combinesum(i+1, arr, target, list, res);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = new ArrayList<>();
        combinesum(0, arr, target, new ArrayList<>(), res);
        System.out.println(res);
    }
}
