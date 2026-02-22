public class print_Nto_1 {

    static void PrintName(int n){
        if(n ==0){
            return;
        }
        System.out.println(n);
        PrintName(n-1);
    }
    static  void print1toN(int n){
        if(n ==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing from N to 1:");
        PrintName(n);
        System.out.println("Printing from 1 to N:");
        print1toN(n);
    }
}
