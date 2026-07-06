
import java.util.*;
public class groupanagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str1 : strs) {
            char[] ch = str1.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(str1);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        groupanagram ga = new groupanagram();
        System.out.println(ga.groupAnagrams(strs)); 
    }
}
