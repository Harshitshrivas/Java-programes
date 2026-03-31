
public class longestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int i = 0, j = 0;
        int map[] = new int[256]; // to store the count of characters

        while (j < n) {
            char ch = s.charAt(j);
            map[ch]++; // increment the count of the character

            while (map[ch] > 1) { // if the character is repeated
                char leftChar = s.charAt(i);
                map[leftChar]--; // decrement the count of the left character
                i++; // move the left pointer
            }

            ans = Math.max(ans, j - i + 1); // update the answer
            j++; // move the right pointer
        }

        return ans; // return the length of the longest substring without repeating characters
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
