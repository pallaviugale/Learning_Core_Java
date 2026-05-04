class Table {

    // static synchronized method
    static synchronized void printTable(int n) {

        System.out.println(Thread.currentThread().getName() + " started");

        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);

            try {
                Thread.sleep(500); // simulate delay
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " finished\n");
    }
}

public class StaticMethodSynchronizedExample {
    public static void main(String[] args) {

        // Two different objects
        Table obj1 = new Table();
        Table obj2 = new Table();

        Thread t1 = new Thread(() -> obj1.printTable(2), "Thread-1");
        Thread t2 = new Thread(() -> obj2.printTable(5), "Thread-2");

        t1.start();
        t2.start();
    }
}