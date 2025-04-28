package Method;

public class prime {
    static boolean primee(int num){

       if(num <=1) return false;

       for(int i=2; i*i<num; i++){                // simply check
         if(num % i ==0){
            return false;
         }
       }                               
       return true;
    }

    static void primeup100(){
        for(int i=1; i<=100; i++){
        if(primee(i)){
            System.out.print(i+ " ");      // upto 100
        }
        }
        System.out.println();
    }

    static void primeup100alternate(){
        int count=0;
        for(int i=0; i<=100; i++){                      // 1 to 100 alternatuve...
            if(primee(i)){
                if(count % 2==0){
                    System.out.print(i + " ");
                }
                count++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
     System.out.println("It is prime: " + primee(5));

     primeup100();
     primeup100alternate();
    }
}
