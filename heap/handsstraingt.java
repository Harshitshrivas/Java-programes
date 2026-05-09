
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class handsstraingt {

    public static boolean isStraight(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false; // If the total number of cards is not divisible by groupSize, it's not possible
                          // to form groups
        }
        Map<Integer, Integer> cardcount = new HashMap<>();
        for (int card : hand) {
            cardcount.put(card, cardcount.getOrDefault(card, 0) + 1); // Count the frequency of each card
        }
        PriorityQueue<Integer> minheap = new PriorityQueue<>(cardcount.keySet()); // Min-heap to get the smallest card
        // Iterate until the min-heap is empty
        while (!minheap.isEmpty()) {
            int firstard = minheap.peek(); // Get the smallest card
            for (int i = 0; i < groupSize; i++) {
                int currentCard = firstard + i; // Calculate the current card in the group
                if (!cardcount.containsKey(currentCard) || cardcount.get(currentCard) == 0) {
                    return false; // If the current card is not in the hand, it's not possible to form a group
                }
                cardcount.put(currentCard, cardcount.get(currentCard) - 1); // Decrease the count of the current card
                if (cardcount.get(currentCard) == 0) {
                    minheap.poll(); // If the count of the current card becomes zero, remove it from the min-heap
                }

            }
        }
        return true; // If all groups can be formed, return true
    }

    public static void main(String[] args) {
        int hand[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int groupSize = 3;
        boolean isStraight = isStraight(hand, groupSize);
        System.out.println("Can the hand be rearranged into groups of " + groupSize + ": " + isStraight);
    }
}
