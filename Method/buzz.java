package Method;

public class buzz {
    static boolean buzznum(int num){
        return num % 10==7 || num % 7==0;             // ends with 7 or divisible by 7
    }

    static void buzzz(){
        for(int i=1; i<=100; i++){
            if(buzznum(i)){
                System.out.print(i+ " ");
            }                                          // 1 to 100
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(buzznum(27));
        buzzz();
    }
}
