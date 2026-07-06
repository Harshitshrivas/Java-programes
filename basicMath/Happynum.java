import java.util.HashSet;

public class Happynum {

    public static int square(int num){

        int ans = 0;
        while(num > 0){
            int remainder = num % 10;
            ans += remainder * remainder;
            num/=10;
        }
        return ans;
    }

    public static boolean isHappy(int num){

        HashSet<Integer> set = new HashSet<>();

        while(num != 0 && !set.contains(num)){
            set.add(num);
            num = square(num);
        }
        return  num==1;
    }

    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }
}
