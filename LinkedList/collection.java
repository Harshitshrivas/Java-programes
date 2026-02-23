
import java.util.LinkedList;

public class collection {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Initial list: " + list);

        list.addFirst(2);
        list.addFirst(1);
        list.addLast(6);
        System.out.println("Final list: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));

        list.set(3, 10);
        System.out.println("After setting index 3 to 10: " + list);

        System.out.println("Does the list contain 4? " + list.contains(4));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.clear();
        System.out.println("After clearing the list: " + list);

    }
}
