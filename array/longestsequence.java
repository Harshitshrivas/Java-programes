
import java.util.HashSet;

public class longestsequence {
    public static int longestConsecutive(int[] arr){

        HashSet<Integer> Set = new HashSet<>();
        int longest = 0;

        for(int num : arr){
            Set.add(num);
        }
        for(int num : arr){

            if(!Set.contains(num -1)){

                int curr = num;
                int length = 1;

                while(Set.contains(curr+1)){
                    curr ++;
                    length++;
                }
                longest = Math.max(longest, length);

            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        System.out.println("The Longest Consecutive Sequence is : " + longestConsecutive(arr));
    }
}
