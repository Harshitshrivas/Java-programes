public class Majority {

    static int Major(int nums[]){  // Brute force approach with time complexity O(n^2) and space complexity O(1)
        int n = nums.length;

        for(int i =0; i< n; i++){
            int count = 0;
            for(int j =0; j< n; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
             if(count > n/2){
               return nums[i];
             }
        }
        return -1;
    }

    static int Majorityelement(int nums[]){  // Boyer-Moore Voting Algorithm with time complexity O(n) and space complexity O(1)

        int count = 0;
        int candidate = 0;

        for(int i =0; i<nums.length; i++){
            
            if(count == 0){
                candidate = nums[i];
            }

            if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;

    }
    public static void main(String[] args) {

        int nums[] = {2,2,1 ,1,1,2,2};
        System.out.println(Major(nums)); 

        int arr[] = {3, 2, 1, 3, 2, 1, 3, 3, 3};
        System.out.println(Majorityelement(arr));
       


    }
}
