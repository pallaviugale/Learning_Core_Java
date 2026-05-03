public class SleepLoopExample {
    public static void main(String[] args) {
        try{
            for(int i = 1; i<= 5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
