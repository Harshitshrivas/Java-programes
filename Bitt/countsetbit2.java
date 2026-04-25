public class countsetbit2 {
    public static void main(String[] args) {
        int num = 12;
        int count = 0;

        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
       System.out.println("Number of set bits: " + count); 
    }
    // This code counts the number of set bits (1s) in the binary representation of a number using bitwise operations. The expression (num & 1) checks if the least significant bit of num is set (1). If it is, it increments the count. Then, it right shifts num by 1 (num >> 1), which effectively divides num by 2 and discards the least significant bit. This process continues until num becomes 0. For example, for num = 12 (1100 in binary), the count will be 2, as there are two set bits in its binary representation.
}
