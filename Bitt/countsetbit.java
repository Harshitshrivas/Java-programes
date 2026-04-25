public class countsetbit {
    public static void main(String[] args) {
        int num = 12;

        int count = 0;
        while(num > 0){
            if(num % 2 == 1){ // check if the last bit is set
                count++;
            }
            num = num / 2;
        }
        if(num == 1){
            count++;
        }
         System.out.println("Number of set bits: " + count); 
         // example: 12 in binary is 1100, which has 2 set bits (1s). 12 % 2 = 0 (not odd), 12 / 2 = 6, 6 % 2 = 0 (not odd), 6 / 2 = 3, 3 % 2 = 1 (odd), count = 1, 3 / 2 = 1, 1 % 2 = 1 (odd), count = 2, 1 / 2 = 0, loop ends. Total count of set bits is 2.

    }
}
