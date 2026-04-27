

public class WrapperExample {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // boxing 

        System.out.println("primitiveInt : " + primitiveInt );
        System.out.println("wrapperInt : " + wrapperInt);

        String num = "1234";
        int parseInt = Integer.parseInt(num); // unboxing
        System.out.println("parseInt : " + parseInt);


//Exception in thread "main" java.lang.NumberFormatException: For input string: "ABC"
        //  String num = "ABC";
        // int parseInt = Integer.parseInt(num);
        // System.out.println("parseInt : " + parseInt);

        Integer a = 100;
         Integer b = 100;
         System.out.println("a == b : " + (a == b)); // true , because of integer caching
         System.out.println("a.equals (b) : " + a.equals(b)); // true



    }
}
