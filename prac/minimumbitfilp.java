public class minimumbitfilp {
    public static void main(String[] args) {
        int start = 10; // 1010
        int goal = 7;   // 0111

        int count = 0;
        int xor = start ^ goal; // 1101    , matlab 3 flip lagega

        while(xor > 0){
            count += xor & 1;
            xor >>= 1;
        }
        System.out.println("Minimum flip are as follow: "+ count);
    }
}
