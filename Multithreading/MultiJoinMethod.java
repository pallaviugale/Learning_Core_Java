class Task extends Thread {
    public Task(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println(Thread.currentThread().getName() + " Finished");
    }
}

public class MultiJoinMethod {
    public static void main(String[] args) throws InterruptedException {

        Task t1 = new Task("FCT1");
        Task t2 = new Task("FCT2");

        t1.start();
        t1.join();   // main waits for t1

        t2.start();
        t2.join();   // main waits for t2

        System.out.println("Main Completed");
    }
}