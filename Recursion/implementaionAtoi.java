
public class implementaionAtoi {
    public static int myAtoii(String s) {
        int i = 0;
        int num = 0;
        int sign = 1;

        // skip space
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // sign checking
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        // digit read
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            if(num > (Integer.MAX_VALUE - digit) / 10) { // Check for overflow
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit; // num = 0*10 + 4 = 4, num = 4*10 + 1 = 41, num = 41*10 + 9 = 419
            i++;
        }
        return num * sign;
    }

    public static void main(String[] args) {
        String s = "   -42";
        int result = myAtoii(s);
        System.out.println(result);

        System.out.println(myAtoii("4193 with words")); // Output: 4193
        System.out.println(myAtoii("words and 987")); // Output: 0
         System.out.println(myAtoii("-91283472332"));  //Output: -2147483648 (clamped
        // to Integer.MIN_VALUE)
    }
}
