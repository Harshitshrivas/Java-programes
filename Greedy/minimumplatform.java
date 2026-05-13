public class minimumplatform {
    public static void main(String[] args) {
        int [] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int [] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        int platform = 1;
        int maxplatform = 1;
        int i = 1, j = 0;

        while(i<n && j < n){
            if(arr[i] <= dep[j]){
                platform++;
                i++;
            }else{
                platform--;
                j++;
            }
            maxplatform = Math.max(maxplatform, platform);
        }
        System.out.println(maxplatform);
    }
}
