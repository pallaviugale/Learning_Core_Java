class MyThread extends Thread {
    public void run(){
        try{
            for(int i = 1;i<=5;i++){
                System.out.println("Thread Running :" + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
}



public class SleepThreadEx {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();
        


        MyThread t2 = new MyThread();

           t2.start();


    }
}
