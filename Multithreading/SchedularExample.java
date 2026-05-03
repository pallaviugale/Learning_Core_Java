class SchThread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName() + "running");
        }
    }
}


public class SchedularExample {
    public static void main(String[] args) {
        SchThread t1 = new SchThread();

        SchThread t2 = new SchThread();

        t1.setPriority(Thread.MIN_PRIORITY);
         t2.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();


    }
}
