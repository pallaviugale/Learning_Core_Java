import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Pallavi");
        map.put(2, "Prajwal");
        map.put(3, "Tanu");
        map.put(1, "Pallavi"); // duplicate key, value replaced

        // Print map
        System.out.println(map);

        // Get value
        System.out.println("Value at key 2: " + map.get(2));

          System.out.println("contains key : " + map.containsKey(2));

          


    }
}