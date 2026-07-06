import java.util.HashMap;

public class word {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map1.containsKey(ch)) {

                if (!map1.get(ch).equals(word)) {
                    return false;
                }

            } else {
                if (map2.containsKey(word)) {
                    return false;
                }

                map1.put(ch, word);
                map2.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }
}
