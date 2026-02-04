public class atoi {

    public static int myAtoi(String s){  // string to integer conversion
     
        int i =0;
        int sign = 1;
        int num = 0;
        
        // space hatane
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
       
        // sign check karne 
        if(i< s.length() && s.charAt(i) == '-'){
           sign = -1;
           i++;
        }else{
            i++;
        }

        // // digit read

        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
          num = num * 10 + (s.charAt(i) - '0');
          i++;
        }

        return num * sign;
    }
    public static void main(String[] args) {
        String s = "   -42";
        int result = myAtoi(s);
        System.out.println(result);

        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("words and 987")); // Output: 0
    }
}
