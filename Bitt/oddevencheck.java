
public class oddevencheck {
    public static void main(String[] args) {
        int num = 7;

        if((num & 1)== 1){
            System.out.println(num + " is Odd");
        }else{
            System.out.println(num + " is Even");
        }
    }
}
