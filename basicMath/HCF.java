public class HCF {

    static  int  hcf(int a, int b){

        while(b !=0){     // Euclidean Algorithm 
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        
        int a = 48;
        int b = 18;
        
        int hcf = 1;
        for(int i=1; i<=a && i<=b; i++){  // hcf loop ka end ma higest factror dedegi ki kisa bada hcf hoga
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);

        int gcd = hcf(a, b);   // function call
        System.out.println(gcd);

    }
}
