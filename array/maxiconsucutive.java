public class maxiconsucutive {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1, 1, 1, 0};
        int n = arr.length;
        int count = 0;
        int max = 0;

        for(int i =0; i<n; i++){
            if(arr[i] == 1){              // if 1 is encountered, increment count
                count++;             // increment count for consecutive 1s
            max = Math.max(count, max);    // update max if count is greater
            }else{
                count = 0;          // reset count if 0 is encountered
            }
        }
        System.out.println(max);
    }
}
