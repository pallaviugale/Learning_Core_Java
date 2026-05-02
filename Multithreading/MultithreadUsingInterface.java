class Thread1 implements Runnable{
    public void run(){
        System.out.println(" Multi Threading using Runable Interface");
    }
}

public class MultithreadUsingInterface {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        // t1.run();
        
        // create Thread class Object and Passed instance of task and task name
        Thread tt=new Thread(t1,"Fct task");
        // call start method 
        tt.start();
    }
}