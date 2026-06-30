public class lengthlast {
    public static void main(String[] args) {
        String str = " Hello World";

        int i = str.length() -1;

        while( i >= 0 && str.charAt(i) == ' '){
            i--;
        }
        int count = 0;

        while(i >=0 && str.charAt(i) != ' '){
            count ++;
            i--;
        }
        System.out.println("The Lenght of last Word of (" + str+ " ) is : " + count);
    }
}
