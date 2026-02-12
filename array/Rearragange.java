public class Rearragange {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int n = arr.length;
        int postiveidx = 0;
        int negativeidx = 1;
        int result[] = new int[n];

        for(int i =0; i<n; i++){

            if(arr[i] < 0){          // if element is negative, put it at negative index
                result[negativeidx] = arr[i];    
                negativeidx += 2;
            }else{                   // if element is positive, put it at positive index
                result[postiveidx] = arr[i];
                postiveidx += 2;
            }
        }
        System.out.println("The rearranged array is : ");
        for(int i =0; i<n; i++){
            System.out.print(result[i] + " ");
        }
    }
}
