public class NestedTryCatch {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;

        try {   // Outer try
            int arr[] = {10,20,30};

            System.out.println(arr[2]); // valid

            try {   // Inner try
                int result = a / b;
                System.out.println(result);
            }

            catch(ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index problem");
        }

        System.out.println("Program continues");
    }
}