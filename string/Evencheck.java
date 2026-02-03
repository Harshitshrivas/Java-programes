public class Evencheck {
    public static void main(String[] args) {
        
            String s = "HelloWorld";
            
            int length = s.length();

            if(length % 2==0){
                System.out.println(s + " is Even");
            }else{
                System.out.println("String is not even");
            }
    }
}
