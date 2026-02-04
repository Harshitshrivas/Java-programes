public class Roman_to_int {

    static int romanToInt(String s){
        int ans = 0;
        int num = 0;

        for(int i = s.length()-1; i>= 0; i--){
            char ch = s.charAt(i);
          switch (ch) {
             case 'I' -> num = 1;
             case'V' -> num = 5;
             case'X' -> num = 10;
             case'L' -> num = 50;
             case'C' -> num = 100;
             case'D' -> num = 500;
             case'M' -> num = 1000;
           
            }
            if(4 * num < ans){   // check for subtraction case AGER smaller numeral comes before larger numeral
                ans -= num;   
            }else{
                ans += num;   // normal addition case
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV"; // Example Roman numeral
        System.out.println("Integer value of Roman numeral " + s + " is: " + romanToInt(s));

        String s2 = "LVIII"; // Another example
        System.out.println("Integer value of Roman numeral " + s2 + " is: " + romanToInt(s2));

        String s3 = "IX"; // Another example
        System.out.println("Integer value of Roman numeral " + s3 + " is: " + romanToInt(s3));

    }
}
