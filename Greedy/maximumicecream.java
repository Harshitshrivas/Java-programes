import java.util.Arrays;

public class maximumicecream {
    public static void main(String[] args) {
        int costs[] = { 1, 3, 2, 4, 1 };
        int coinn = 7;

        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coinn) {
                coinn -= costs[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
