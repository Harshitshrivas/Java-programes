
import java.util.PriorityQueue;

public class klargestatream {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;

    public klargestatream(int k , int arr[]){  // Constructor to initialize the min-heap with the first k elements of the array
        this.k = k;

        for(int i =0; i<arr.length; i++){
            minHeap.add(arr[i]);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }   
    }

    public int add(int val){
        minHeap.add(val);

        if(minHeap.size() > k){
            minHeap.poll();
        }

        return minHeap.peek();
    }
   
    public static void main(String[] args) {
        int [] arr = { 10, 5, 21, 30, 7, 45, 2, 11 };
        int k = 3;
        klargestatream klargestStream = new klargestatream(k, arr);
        System.out.println(klargestStream.add(25)); // Should return the 3rd largest element after adding 25
        System.out.println(klargestStream.add(50)); // Should return the 3rd largest element after adding 50
        System.out.println(klargestStream.add(1)); // Should return the 3rd largest element after adding 1
        System.out.println(klargestStream.add(40)); // Should return the 3rd largest element after adding 40
    }
}
