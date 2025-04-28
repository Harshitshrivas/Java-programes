package Method;

public class evenrange {
    static void  evenodd(int start, int end){
        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        evenodd(5, 15);
    }
}
