
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    
    public static boolean Anagaramm(String s1, String s2){
      
        if(s1.length() != s2.length()){
            return  false;
        }

        char[] ch = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);
       
        return Arrays.equals(ch, ch2);
    }

    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in);){
    System.out.println("Enter the First string  ");
    String s1 = sc.nextLine();
    System.out.println("Enter the second string  ");
    String s2 = sc.nextLine();

       if(Anagaramm(s1, s2)){
        System.out.println("String are Anagram");
       }else{
        System.out.println("String are not Anagram");
       }

    }
  }
}
