import java.util.*;

class Animal {
    void eat(){
        System.out.println("The Aniaml eats ");
    }
    void sleep(){
        System.out.println("Animal is sleeping ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("the dogs barks");
    }
}



public class Inheritance {
    public static void main(String[] args) {
         Dog myDog = new Dog();
        // Inherited methods (from Animal)
        myDog.eat();    
        myDog.sleep();  
        // Child class method
        myDog.bark();
    }
    
}
