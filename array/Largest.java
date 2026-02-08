public class Largest {
    public static void main(String[] args) {
        int arr[] = {10, 5, 21, 30, 7, 45, 2, 11};
        int largest = arr[0];

        for(int i =0; i<= arr.length -1; i++){
           if(arr[i] > largest)
            largest = arr[i];
        }
        System.out.println("The larget num is : "+ largest);
    }
}
