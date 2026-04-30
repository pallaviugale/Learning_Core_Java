import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet <String> hash = new HashSet<>();

        hash.add("Pallavi");
        hash.add("Ugale");
        hash.add("is ");
        hash.add("Good");
        hash.add("Girl");
        hash.add("Pallavi"); // duplicate ignore
        System.out.println(hash);

        System.out.println("Hashcode :" + hash.hashCode());

        // iterator 
        System.out.println("Using Iterator :");
        Iterator<String> it = hash.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }





    }
}
