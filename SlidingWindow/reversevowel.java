public class reversevowel {
    public static String  reverseVowels(String s){
     char [] ch= s.toCharArray();
     int left = 0;
     int right = s.length() -1;
     while(left < right){   // 2 pointer approach 
        if(!isVowel(ch[left])){
            left ++;
        }else if(!isVowel(ch[right])){
            right --;
        }
        else {
            char temp = ch[left];
            ch[left] =ch[right];
            ch[right] =temp;
            left ++;
            right --;
        }
     }
     return new String(ch);
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
      
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        String result = reverseVowels(s);
        System.out.println("Original string: " + s);
        System.out.println("String after reversing vowels: " + result);
    }
}
