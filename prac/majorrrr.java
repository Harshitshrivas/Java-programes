public class majorrrr {

    static int majorityyy(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    static int majoriyybava(int arr[]){
        int n = arr.length;

        int count = 0;
        int candidate = 0;
        for(int i =0; i<n; i++){

            if(count == 0){
                candidate = arr[i];
            }
            if(arr[i] == candidate){
                count ++;
            }else{
                count --;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("The Majority Elemnt are: " + majorityyy(nums));

          int arr[] = {3, 2, 1, 3, 2, 1, 3, 3, 3};
        System.out.println("The Majority Element is: " + majoriyybava(arr));
    }
}
