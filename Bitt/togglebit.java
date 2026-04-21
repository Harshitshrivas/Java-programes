public class togglebit {
    public static void main(String[] args) {
        int num = 9;
        int position = 3;

         // << is the left shift operator, it shifts the bits of 1 to the left by 'position' places like 1 << 3 will give 8 (1000 in binary)

        num = num ^ (1 << position);
        System.out.println("Number after toggling bit at position " + position + ": " + num);
        // 9 = 1001 , 1 << 3 = 1000, num ^ (1 << position) = 1001 ^ 1000 = 0001 (which is 1 in decimal)
    }
}
