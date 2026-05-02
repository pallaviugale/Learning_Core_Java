
class Mythread extends Thread{
    public void run(){
        System.out.println("thread is running");
        System.out.println(Thread.currentThread().getName());
    }
}
public class MutlithreadingEx {
    public static void main(String[] args) {
         Mythread t1 = new Mythread();
         t1.start();

         Thread t2 = new Thread("FCT thread ");
         t2.start();

         System.out.println(t2.getName());


         Mythread t3 = new Mythread();
         t3.setName("3 rd thread");
         t3.start();



    }
   
}
