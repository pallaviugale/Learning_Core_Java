public class Trykeyword {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        }

        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        catch(Exception e) {
            System.out.println("An error occurred");
        }

        System.out.println("Program continues");
    }
}