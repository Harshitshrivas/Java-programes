public class stringtoint {
    public static void main(String[] args) {
        
        String s = "123";
        int num = Integer.parseInt(s);
        System.out.println("String to integer: " + num);

        int numm = 123;
        String ss = String.valueOf(numm);
        System.out.println("Integer to String: " + ss);
    }
}
