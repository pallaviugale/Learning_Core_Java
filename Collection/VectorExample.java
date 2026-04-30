import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Pallavi");
        v.add("Prajwal");
        v.add("Tanu");
        v.add("Pallavi");
          v.add("Tanu"); // duplicates allowed

        System.out.println(v);

        // Access element
        System.out.println("Element at index 1: " + v.get(1));

        // Size
        System.out.println("Size: " + v.size());

      System.out.println("Capacity: " + v.capacity());


    }
}