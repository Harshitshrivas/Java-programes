public class unionarray {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5, 6 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        int union[] = new int[n1 + n2]; // array to store the union of arr1 and arr2
        int k = 0; // index for union array

        System.out.println("Union of the two arrays is : ");

        while (i < n1 && j < n2) {                  
            if (arr1[i] < arr2[j]) {     // If the current element of arr1 is smaller than the current element of arr2
                if (k == 0 || union[k - 1] != arr1[i]) {      // Check if the current element is not  duplicate in the union array
                    union[k] = arr1[i];
                    k++;
                }
                i++;
            } else if (arr2[j] < arr1[i]) {        // If the current element of arr2 is smaller than the current element of arr1
                if (k == 0 || union[k - 1] != arr2[j]) {
                    union[k] = arr2[j];
                    k++;
                }
                j++;
            } else {       // If the current elements of arr1 and arr2 are equal, add it to the union array and move both pointers
                if (k == 0 || union[k - 1] != arr1[i]) {
                    union[k] = arr1[i];
                    k++;
                }
                i++;
                j++;
            }
        }
       // Add remaining elements of arr1 to union array
        while (i < n1) {
            if (k == 0 || union[k - 1] != arr1[i]) {
                union[k] = arr1[i];
                k++;
            }
            i++;
        }
        // Add remaining elements of arr2 to union array
        while (j < n2) {
            if (k == 0 || union[k - 1] != arr2[j]) {
                union[k] = arr2[j];
                k++;
            }
            j++;
        }

      for (int m = 0; m < k; m++) {
          System.out.print(union[m] + " ");
      }
      System.out.println();

    }
}
