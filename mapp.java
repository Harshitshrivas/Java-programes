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
    }
}
