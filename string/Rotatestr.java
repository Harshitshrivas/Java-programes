public class Rotatestr {
    public static  boolean  rotateStr(String s1 , String Goal){
        if(s1.length() != Goal.length()){
            return false;
        }

        return  (s1 + s1).contains(Goal);
    }
    public static void main(String[] args) {

        String str1 = "abcde" , goal1 = "cdeab";  
        System.out.println("Rotation of String is "+ rotateStr(str1, goal1));

        String str2 = "abcde", goal2 = "abced";
        System.out.println("Rotation of String is " + rotateStr(str2, goal2));

    }
}
