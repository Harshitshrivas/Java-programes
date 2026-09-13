public class sorttttttttttt {
    public static void main(String[] args) {
        int num[] = { 0, 1, 2, 0, 1, 2, 1, 1, 0, 0, 2, 1 };
        int mid = 0;
        int low = 0;
        int high = num.length - 1;

        while (mid <= high) {
            switch (num[mid]) {
                case 0 -> {
                    int temp = num[mid];
                    num[mid] = num[low];
                    num[low] = temp;
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                default -> {
                    int tempSwap = num[mid];
                    num[mid] = num[high];
                    num[high] = tempSwap;
                    high--;
                }
            }
        }
        for (int i = 0; i < num.length; i++) { // Time complexity is O(n) and space complexity is O(1)
            System.out.print(num[i] + " ");
        }
    }
}
