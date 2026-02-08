public class secandlargest {
    public static void main(String[] args) {
         int arr[] = {10, 5, 21, 30, 7, 45, 2, 11};
         int largest = arr[0];

         for(int i =0; i<=arr.length -1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
         }
      
         int Secondlarge = -1;

         for(int i =0; i<= arr.length -1; i++){

            if(arr[i] > Secondlarge && arr[i]< largest){
                Secondlarge = arr[i];
            }
         }
         System.out.println("The Second largest in thr array are : " + Secondlarge);
          
    }
}
