public class largeestodd {
    public static void main(String[] args) {
        
       String str = "3244267";
       int idx = -1;
        for(int i = str.length() -1; i>=0; i--){
       
            int digit =str.charAt(i) - 0;

            if(digit % 2 != 0){
             idx = i;
             break;
            }
        }
        if(idx ==-1){
            System.out.println("No odd number");
        }else{
            System.out.println(str.substring(0, idx +1));
        }
    }
}
