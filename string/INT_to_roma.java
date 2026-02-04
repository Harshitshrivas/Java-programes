public class INT_to_roma {

    static String intToRoman(int s ){
     
        int n[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String str[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder res = new StringBuilder();
        for(int i =0 ; i<n.length; i++){
          while(s >= n[i]){
            s -= n[i];
            res.append(str[i]);
          }
        }
        return  res.toString();

    }
    public static void main(String[] args) {
        
        int num = 1994;
        System.out.println("Roman numeral for " + num + " is: " + intToRoman(num));

        int num2 = 58;
        System.out.println("Roman numeral for " + num2 + " is: " + intToRoman(num2));
    }
}
