
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class mergeKsort {

    static class Node {
        int data;
        int row;
        int col;

        public Node(int data, int row, int col) {
            this.data = data;
            this.row = row;
            this.col = col;
        }
    }

    public static List<Integer> mergeKSortedArrays(int[][] arr) {
        // Implement the logic to merge k sorted arrays using a min-heap
        PriorityQueue<Node> minheap = new PriorityQueue<>((a, b) -> a.data - b.data); // Min-heap based on the data
                                                                                      // value
        // Add the first element of each array to the min-heap
        for (int i = 0; i < arr.length; i++) {
            minheap.add(new Node(arr[i][0], i, 0)); // Add the first element of each array along with its row and column
                                                    // indices
        }
        List<Integer> result = new ArrayList<>();

        while (!minheap.isEmpty()) {
            Node current = minheap.poll(); // Remove the smallest element from the min-heap
            result.add(current.data); // Add the smallest element to the result list
            int nextCol = current.col + 1; // Get the column index of the next element in the same row
            if (nextCol < arr[current.row].length) { // Check if there are more elements in the same row
                minheap.add(new Node(arr[current.row][nextCol], current.row, nextCol)); // Add the next element from the
                                                                                        // same row to the min-heap
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 5 }, { 2, 6, 7 }, { 3, 9, 10 } };
        List<Integer> merged = mergeKSortedArrays(arr);
        System.out.println(merged);
    }
}
