import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Pallavi");
        table.put(2, "Prajwal");
        table.put(3, "Tanu");
        table.put(1, "Pallavi"); // duplicate key → value replaced

        // Print table
        System.out.println(table);

        // Get value
        System.out.println("Value at key 2: " + table.get(2));

        // Check key
        System.out.println("Contains key 2: " + table.containsKey(2));
    }
}