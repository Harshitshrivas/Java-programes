
public class twosum {
    static int[] twoSum(int arr[],int target){
        
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){     
                if(arr[i] + arr[j] == target){
                 return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 18;
        int result[] = twoSum(arr, target);   // Brute force approch 
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + " are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to " + target);
        }
    }
}
