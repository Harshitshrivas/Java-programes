public class Singlenonrepat {
    public static void main(String[] args) {
        
        String str = "geeksforgeeks";
        int temp [] = new int[26];    // assuming only lowercase letters

        for(int i =0; i<str.length(); i++){
            temp[str.charAt(i) - 'a'] ++;   // counting frequency of each character
        }
        
        char ans= '$';
        for(int i =0; i<str.length(); i++){
            if(temp[str.charAt(i) - 'a'] == 1){   // first non repeating character
                ans = str.charAt(i);
                break;
            }
        }
        System.out.println("First non-repeating character is: " + ans);
    }
}
