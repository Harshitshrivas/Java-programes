package Method;

public class perfect{
    static boolean perfectcheck(int num){
        int sum=0;
        for(int i=1; i<num ; i++){
            if(num % i==0){
           sum += i;                       // 6 = 1, 2, 3= 3+2+1=6 so it perfect
            }
        }
        return num== sum;
    }

    static void perfectuptp100(){
        for(int i=1; i<=100; i++){
            if(perfectcheck(i)){
                System.out.print(i+ " ");
            }                                           // uptpoo 100
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("It is perfect: " + perfectcheck(6));
        perfectuptp100();
    }
}
