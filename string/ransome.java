public class ransome {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int count[] = new int[26];
         for(int i = 0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            count[ch - 'a']++;
        }

        for(int i =0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(count[ch - 'a'] == 0){
                return false;
            }
            count[ch - 'a'] --;
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
