import java.util.ArrayList;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        result.add(List.of(arr[i], arr[j], arr[k])); // Add the triplet to the result list (List.of is used to create an immutable list)
                    }
                }
            }
        }
        System.out.println(result); // Brute force approach, time complexity is O(n^3) and space complexity is O(1)
    }
}
