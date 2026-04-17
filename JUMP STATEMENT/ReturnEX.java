public class ReturnEX {
    // public static void checkNumber(int num) {
    //     if(num < 0){
    //         System.out.println("negative number");
    //         return;
    //     }
    //     System.out.println("positive number");
        
    // }
    // public static void main(String[] args) {
    //     checkNumber(-10);
    // }

    public static void fact(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
       
        System.out.println(fact);

        
    }
    public static void main(String[] args) {
        fact(5);
    }
    
}