package Method;

public class duckk {
    static boolean duckcheck(String num){
        if(num.charAt(0)=='0'){
            return false;
        }
        for(int i=1; i<num.length(); i++){
          if(num.charAt(i)=='0'){
            return true;
          }
        }
        return false;
    }
    public static void main(String[] args) {
     System.out.println(duckcheck("1034"));
    }
}
