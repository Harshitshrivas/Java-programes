import java.util.HashMap;

public class mapp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Harshit");
        map.put(2, "Harshu");
        map.put(3, "Harshit Shrivas");
        map.put(4, "Harshvardhan");
        map.put(5, "Harsh Rai");

        System.out.println(map); // print the entire map

        String stu = map.get(3); // yaha mai 3 key ke corresponding value ko get kar raha hu
        System.out.println(stu); //

        System.out.println("The map contains key 4: " + map.containsKey(4));
        System.out.println("The map contains value 'Harshu': " + map.containsValue("Harshu"));

        // loop
        for (Integer key : map.keySet()) { // keyset se mai map ke sare keys ko access kar raha hu
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // remove a key-value pair
        map.remove(5);
        System.out.println("After removing key 5: " + map);

        boolean removed = map.remove(4, "Harshuuuuuu"); // agar key 4 ke corresponding value "Harshuuuuuu" hai to hi
                                                        // remove karega
        System.out.println("removed: " + removed);

       System.out.println("Size of the map: " + map.size()); // size of the map

       map.replace(3, "Harshit Shrivas Updated");
       System.out.println("After replacing key 3: " + map);

         map.clear(); // clear the map
         System.out.println("After clearing the map: " + map);


    }
}
