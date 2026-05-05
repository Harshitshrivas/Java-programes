
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class taskshudulur {
    public static int leastInterval(char[] tasks, int n) {

        int freq[] = new int[26];
        for (char ch : tasks) {
            freq[ch - 'A']++;
        }
        Arrays.sort(freq);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.add(freq[i]);
            }
        }
        int time = 0;
        while(!pq.isEmpty()){
            int k = n+1;
           List<Integer> temp = new ArrayList<>();
           while(k > 0 && !pq.isEmpty()){
               int curent = pq.poll();
                if(curent > 1){
                     temp.add(curent-1);
                }
                time++;
                k--;
                 
           }

           for(int i = 0 ; i < temp.size(); i++){
               pq.add(temp.get(i));
           }
           if(!pq.isEmpty()){
               time += k;
           }
        }
        return time;
        // Time Complexity: O(n log n) due to sorting the frequency array and the
    }

    public static void main(String[] args) {
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;
        int result = leastInterval(tasks, n);
        System.out.println("Minimum time required to complete all tasks: " + result);

    }
}
