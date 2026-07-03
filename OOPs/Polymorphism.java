package OOPs;
import java.util.*; 

class Add {     
    public int sum(int a , int b){       
        return a + b;     
    }     
    public float sum(float a , float b){       
        return a + b;     
    }     
    public int sum(int a , int b , int c){       
        return a + b + c;     
    }   
}   
public class Polymorphism {    
    public static void main(String[] args) {     
        Add obj = new Add(); 
        System.out.println(obj.sum(1, 2));      
        System.out.println(obj.sum(1.5f, 2.5f)); 
        System.out.println(obj.sum(1, 2, 3));   
    }      
}
