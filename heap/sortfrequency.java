
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortfrequency {

    public String frequencysort(String s) {

        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a)); // Max-heap based on frequency
                        
        pq.addAll(freq.keySet()); // Add all keys from the frequency map to the priority queue
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char current = pq.poll(); // Get the character with the highest frequency
            int count = freq.get(current); // Get the frequency of the current character
            for (int i = 0; i < count; i++) {
                sb.append(current);
            }
        }
        return sb.toString();
        // Time Complexity: O(n log n) due to the priority queue operations, where n is the number of unique characters in the input string.
        // Space Complexity: O(n) for the frequency map and the priority queue, where n is the number of unique characters in the input string.

    }

    public static void main(String[] args) {
        String s = "tree";
        sortfrequency sf = new sortfrequency(); // Create an instance of the sortfrequency class
        String result = sf.frequencysort(s);
        System.out.println("Test Result: " + result); // Output: "eert" or "eetr"
    }
}
