public class permutaton {
   
    public static boolean arePermutations(String s1 , String s2){

        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 != n2){
            return false;
        }

        int charr[] = new int[256];
        for(int i = 0; i < n1; i++){
            charr[s1.charAt(i)]++;
        }

        for(int i = 0; i < n2; i++){
            charr[s2.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++){
            if(charr[i] != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (arePermutations(s1, s2)) {
            System.out.println("The strings are permutations of each other.");
        } else {
            System.out.println("The strings are not permutations of each other.");
        }
    }
}
