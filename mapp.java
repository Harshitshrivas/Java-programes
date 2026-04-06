import java.util.HashMap;

public class mapp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Harshit");
        map.put(2, "Harshu");
        map.put(3, "Harshit Shrivas");
        map.put(4, "Harshvardhan");
        map.put(5, "Harsh Rai");

        System.out.println(map);

        String stu = map.get(3);
        System.out.println(stu);

    }
}
