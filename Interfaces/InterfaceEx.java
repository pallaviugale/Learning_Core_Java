

interface Vehicle {
   
   

  public void start();

  public void stop();
    
}

class Car implements Vehicle{
   
    public void start(){
        
       
        System.out.println("Car started successfully");
    }

   public  void stop(){
         System.out.println("Car stopped successfully");

    }

    
}

class Bike implements Vehicle{
 

    public void start(){
        
        System.out.println("Bike started successfully");
    }

   public void stop(){
         System.out.println("Bike stopped successfully");

    }


   
}

public class InterfaceEx {
    public static void main(String[] args) {

        Car car= new Car();
        car.start();
       car.stop();

        Bike bike = new Bike();
        bike.start();
       bike.stop();
        
    }
}

