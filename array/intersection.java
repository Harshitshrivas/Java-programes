public class intersection {
    public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 4, 4, 5, 5,5,6};
    int arr2[] = {1, 3, 3, 3, 6};
    int n1 = arr1.length;
    int n2 = arr2.length;
    int i =0, j=0;

    int intersect[] = new int[Math.min(n1, n2)]; // array to store the intersection of arr1 and arr2
    int k = 0; // index for intersect array
    
    System.out.println("Intersection of the two arrays is : ");
    while(i <n1 && j < n2){

        if(arr1[i] < arr2[j]){   // If the current element of arr1 is smaller than the current element of arr2, move the pointer of arr1
            i++;
        }else if(arr2[j] < arr1[i]){  // If the current element of arr2 is smaller than the current element of arr1, move the pointer of arr2
            j++;
        }else{ // If the current elements of arr1 and arr2 are equal, add it to the intersect array and move both pointers
            if(k ==0 || intersect[k-1] != arr1[i]){
                intersect[k] = arr1[i];
                k++;
            }
            i++;
            j++;
        }
    }
  // Print the intersection of the two arrays
    for(int m=0;m<k; m++){
        System.out.print(intersect[m] + " ");
    }

    }
}
