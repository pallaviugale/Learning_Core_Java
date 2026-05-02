class  Multithread1 extends Thread {
public void run(){
    for(int i = 1;i<=5;i++)
    {
        System.out.println("Task 1:" + i);
    }
}
}

class  Multithread2 extends Thread {
public void run(){
    for(int i = 1;i<=5;i++)
    {
        System.out.println("Task 2:" + i);
    }
}
}



public class MutlithreadExample {
    public static void main(String[] args) {
        Multithread1 t1 = new Multithread1();
        Multithread2 t2 = new Multithread2();

        t1.start();
        t2.start();
    }
}
