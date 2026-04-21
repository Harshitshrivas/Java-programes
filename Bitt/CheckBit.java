public class CheckBit {
    public static void main(String[] args) {
        int num = 9; // Number to check
        int position = 3; // Position to check (0-based index)

        // << is the left shift operator, it shifts the bits of 1 to the left by 'position' places like 1 << 3 will give 8 (1000 in binary)
        if((num & (1 << position)) != 0){ // Check if the bit at the specified position is set
            System.out.println("Bit at position " + position + " is set (1)");
        }else{
            System.out.println("Bit at position " + position + " is not set (0)");
        }
    }
}
