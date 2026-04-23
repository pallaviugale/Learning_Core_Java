

abstract class Vehicle {
    int noOfwheels;

    void displayTyre(){
        System.out.println("The vehicle has " + noOfwheels + " wheels");
    }

    abstract void start();
    
}

class Car extends Vehicle{
   
    void start(){
        
        noOfwheels = 4;
        System.out.println("Car started successfully");
    }

    
}

class Bike extends Vehicle{
 

    void start(){
         noOfwheels = 2;
        System.out.println("Bike started successfully");
    }

   
}

public class AbstractEX {
    public static void main(String[] args) {

        Car car= new Car();
        car.start();
        car.displayTyre();

        Bike bike = new Bike();
        bike.start();
        bike.displayTyre();
        
    }
}
