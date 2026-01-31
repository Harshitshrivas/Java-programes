public class Merge {

static void MergeSort(int arr[], int left, int right){
             
        if(left < right){
            int mid = left + (right - left)/2;
            MergeSort(arr,left, mid);      // left
            MergeSort(arr, mid+1, right);  //right
            mergee(arr, left, mid, right);  
        }
    }

static void mergee(int arr[], int left, int mid, int right){
    
    int arr1[] = new int[right - left + 1];  // iska andar merge hoke jayga...
      int x =0;
      int indx1 = left;
      int indx2 = mid+1;

      while(indx1 <= mid && indx2 <= right){
        if(arr[indx1] <= arr[indx2]){
            arr1[x] = arr[indx1];
            x++;
            indx1++; 
        }else{
            arr1[x] = arr[indx2];
            x++;
            indx2++;
        }
      }

    while(indx1 <= mid){
        arr1[x++] = arr[indx1++];
    } 
    while(indx2 <= right){
        arr1[x++] = arr[indx2++];
    } 
for(int i=0, j=left; i<arr1.length; i++, j++){
    arr[j] = arr1[i];
}

}    
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        
        MergeSort(arr, 0, n-1);
        for(int i =0; i<n; i++){
         System.out.print(arr[i] + " ");
        }

    }
}
