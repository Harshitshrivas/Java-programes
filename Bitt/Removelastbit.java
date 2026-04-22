public class Removelastbit {
    public static void main(String[] args) {
        
        int num = 9;

        System.out.println("Original number: " + num);
        num = num & (num - 1); // Remove the last set bit from the number
        System.out.println("Number after removing the last set bit: " + num);
        // 9 = 1001, num - 1 = 8 (1000 in binary), num & (num - 1) = 1001 & 1000 = 1000
        // (which is 8 in decimal)
    }
}
