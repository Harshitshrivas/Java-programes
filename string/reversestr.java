public class reversestr {
    public static void main(String[] args) {
        
        String str = "Harshit shrivas";

        char ch[] = str.toCharArray();
        int length= str.length();

        for(int i =0; i<length/2; i++){  // loop chalaye ga sirf aadha hi

            char temp = ch[i];
            ch[i] = ch[length - i - 1];   // swaping logic
            ch[length - i - 1] = temp;
        }
     
        String reverse = new String(ch);
        System.out.println(reverse);

    }
}
