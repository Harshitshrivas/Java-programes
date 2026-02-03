public class Reverse {
    
    // public static void main(String[] args) {      // time complexity - 0n2
    //     String str = "Hello World";
    //     String rev = "";
        
    //     for(int i = str.length()-1 ; i>=0 ; i--){
    //         rev = rev + str.charAt(i);
    //     }

    //     System.out.println("Original String: " + str);
    //     System.out.println("Reversed String: " + rev);
    // }

    public static void main(String[] args) {
        
        String str = "Hello hy";
        char[] arr = str.toCharArray();
        int leng = str.length();

        for(int i=0 ; i< leng/2; i++){    // first aur last value ko replace kare , swaping lga ka 
            char temp = arr[i];
            arr[i] = arr[leng - i - 1];       // ch[i] pehla hogya , length - 1 last hogya , aur length - i iss liya lagaye kyuki 
            arr[leng - i - 1] = temp;        //string aage bhi jaugi
        }

        String reversedd = new String(arr);
        System.out.println(reversedd);

    }
}
