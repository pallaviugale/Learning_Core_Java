public class SleepThreadExample {
    public static void main(String[] args) {
        try{
            System.out.println("Program Started");
            Thread.sleep(5000);
            System.out.println("Program resumed After 5 seconds");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
