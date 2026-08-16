
public class largesttt {
    public static void main(String[] args) {
        int arr[] = { 10, 15, 66, 71, 5, 32, 20 };
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
