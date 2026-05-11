
import java.util.Arrays;

public class assigncokies {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        // for (int i = 0; i < g.length; i++) {
        //     for (int j = 0; j < s.length; j++) {
        //         if (g[i] <= s[j]) {
        //             count++;
        //             s[j] = 0;
        //             break;
        //         }
        //     }
        // }
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = { 1, 2, 3, 7 }; // y cookies hai jo assign hogi
        // int[] s = {8 , 1, 2 , 4 }; // bina sort kiyee 3 aayega jo ki galat hai , sort
        // karne ke baad 4 aayega jo ki sahi hai , ya jada hona chahiye tab hi assign
        // hoga
        int[] s = { 1, 2, 4 };
        System.out.println(findContentChildren(g, s));
    }
}
