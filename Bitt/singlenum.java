public class singlenum {
    public static void main(String[] args) {
        int num[] = {2, 3, 5, 4, 5, 3, 4}; // Array with one single number and pairs of numbers
        int result = 0;
        for(int i =0; i<num.length; i++){
            int number = num[i];
            result = result ^ number; // XOR operation to find the single number
        }
        System.out.println("The single number is: " + result); // Output the single number
    }
}
