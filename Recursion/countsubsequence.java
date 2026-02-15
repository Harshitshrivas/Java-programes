public class countsubsequence {

    public static int countSubsequence(int i, int sum, int arr[], int k) {

        if (i == arr.length) {
            if (sum == k) {        // agar sum k ke barabar hai to 1 return karna chahiye, kyunki ek valid subsequence mil gaya hai, aur agar sum k ke barabar nahi hai to 0 return karna chahiye, kyunki valid subsequence nahi mila hai
                return 1;
            }
            return 0;
        }
        int pick = countSubsequence(i + 1, sum + arr[i], arr, k);
        int notpick = countSubsequence(i + 1, sum, arr, k);

        return pick + notpick;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1};    // arr me 1, 2, 1 hai, aur k 2 hai, to valid subsequences hai [1, 1], [2], to total 2 valid subsequences hai, isliye answer 2 aayega
        int k = 2;
        int ans = countSubsequence(0, 0, arr, k);
        System.out.println("Number of subsequences with sum " + k + " is: " + ans);

    }
}
