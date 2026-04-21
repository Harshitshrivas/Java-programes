public class CheckBit {
    public static void main(String[] args) {
        int num = 9; // Number to check
        int position = 3; // Position to check (0-based index)

        if((num & (1 << position)) != 0){
            System.out.println("Bit at position " + position + " is set (1)");
        }else{
            System.out.println("Bit at position " + position + " is not set (0)");
        }
    }
}
