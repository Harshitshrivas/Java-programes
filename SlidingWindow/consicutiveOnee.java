public class consicutiveOnee {
    public static int maxiconsucutiveOne(int nums[], int k) { // isme hume maximum consecutive one chahiye with at most k zeros 
        int i = 0;
        int Zerocount = 0;
        int maxlength = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == 0) {
                Zerocount++;
            }
            while (Zerocount > k) {
                if (nums[i] == 0) {
                    Zerocount--;
                }
                i++;
            }
            maxlength = Math.max(maxlength, j - i + 1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }; // Example input array
        int k = 2;
        int result = maxiconsucutiveOne(nums, k);
        System.out.println("Maximum consecutive ones with at most " + k + " zeros: " + result);
    }
}
