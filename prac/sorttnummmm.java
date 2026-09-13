public class sorttnummmm {
    public static void main(String[] args) {
        int num[] = { 0, 1, 2, 0, 1, 2, 1, 1, 0, 0, 2, 1 };

        for (int i = 0; i < num.length; i++) {
            int smallestt = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[smallestt] > num[j]) {
                    smallestt = j;
                }

            }
            int temp = num[smallestt];
            num[smallestt] = num[i];
            num[i] = temp;
        }
        for (int i = 0; i < num.length; i++) { // Time complexity is O(n^2) and space complexity is O(1)
            System.out.print(num[i] + " ");
        }
    }
}
