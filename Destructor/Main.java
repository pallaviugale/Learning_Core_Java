// destructor and garbage collector 


class Demo{

    Demo(){
        System.out.println("consrtuctor is called ");
    }
    
   @Override
   protected void finalize() throws Throwable {
    System.out.println("Finalize method is called ");
   }

}

public class Main {
    public static void main(String[] args) {
   Demo demo = new Demo();
   demo = null ;
   System.gc();
    }
}
