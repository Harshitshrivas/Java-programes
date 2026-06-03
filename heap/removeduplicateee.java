
import java.util.HashSet;

public class removeduplicateee {
    public static void main(String[] args){
        int arr[] = {1,2,2,3,4,4};
        int n = arr.length;
        HashSet<Integer> map = new HashSet<>();
        for(int i =0; i<n; i++){
            map.add(arr[i]);
        }
        System.out.println(map);
    }
}
