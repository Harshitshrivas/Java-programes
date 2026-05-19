public class maxvowelsubstring {
    public static int maxVowels(String s, int k) {
        int maxcout = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
            if (i >= k) { // Check if the window size exceeds k
                char leftChar = s.charAt(i - k); // Get the character that is sliding out of the window
                if (isVowel(leftChar)) {
                    count--; // Decrease the count if the left character is a vowel
                }
            }
            maxcout = Math.max(maxcout, count);
        }
        return maxcout;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int maxVowels = maxVowels(s, k);
        System.out.println("Maximum number of vowels in any substring of length " + k + ": " + maxVowels);
    }
}
