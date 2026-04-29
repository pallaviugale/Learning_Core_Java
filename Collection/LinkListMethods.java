import java.util.LinkedList;

public class LinkListMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python ");
         list.add("C++"); 
         System.out.println(list);

         list.addFirst("start");
         list.addLast("End");
         System.out.println("List : " + list);

         System.out.println("get(2) :" + list.get(2));
           System.out.println("First:" + list.getFirst());
            System.out.println("Last:" + list.getLast());

            list.set(2,"dotnet");

            list.remove();
            list.removeFirst();
            list.removeLast();
            list.remove(1);
            System.out.println("After remove : " + list);

            System.out.println(list.contains("java"));

            System.out.println("sixe :" + list.size());

             LinkedList<String> list2 = new LinkedList<>();
               list2.add("Go");
                list2.add("Rust");

                    list.addAll(list2);

                    list.removeAll(list2);
                    list.add("java");
                    list.retainAll(collections.singleton("java"));
                    System.out.println("afterretainall : " + list);

                    list.offer("New");
                    System.out.println("Peek : " + list.peek());
                     System.out.println("Poll : " + list.poll());

                     list.isEmpty();
                     System.out.println("list : " + list);
                    


            


    }
}
