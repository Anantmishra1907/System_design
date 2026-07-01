import java.util.* ;
abstract class Vehicle {
    abstract void brake();
    abstract void accelarate();
    void startEngine(){
        System.out.println("Engine Started ");
    }
}
class Car extends Vehicle {
    @Override
    void brake(){
        System.out.println("The car applied the brakes ");
    }
    @Override
    void accelarate(){
        System.out.println(" the car accelarated");
    }
}



public class Abstraction {
    public static void main(String[] args) {
         Vehicle myCar = new Car();
        myCar.startEngine();  
        myCar.accelarate();   
        myCar.brake();    
    }
    
}
