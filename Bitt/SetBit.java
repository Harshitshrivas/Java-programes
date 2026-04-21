public class SetBit {
    public static void main(String[] args) {
        int num =9;
        int position = 2; // Position to set (0-based index)

         // << is the left shift operator, it shifts the bits of 1 to the left by 'position' places like 1 << 3 will give 8 (1000 in binary)
        num = num | (1 << position); // Set the bit at the specified position
        System.out.println("Number after setting bit at position " + position + ": " + num);

        // 9 = 1001 , 1 << 2 = 0100, num | (1 << position) = 1001 | 0100 = 1101 (which is 13 in decimal)
        
    }
}
