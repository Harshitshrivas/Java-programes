public class ClearBit {
    public static void main(String[] args) {
        int num = 9;
        int position = 3;

            // << is the left shift operator, it shifts the bits of 1 to the left by 'position' places like 1 << 3 will give 8 (1000 in binary)
        
            num = num & ~(1 << position); // Clear the bit at the specified position
            System.out.println("Number after clearing bit at position " + position + ": " + num);
            
            // 9 = 1001 , 1 << 3 = 1000, ~(1 << 3) = 0111, num & ~(1 << position) = 1001 & 0111 = 0001 (which is 1 in decimal)
    }
}
