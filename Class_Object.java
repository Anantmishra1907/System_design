import java.util.*; 

class Student { 
    String name; 
    int roll_no; 
    void take_leave() { 
        System.out.println("The student is on leave"); 
    } 
    
    void bunk() { 
        System.out.println("The student bunked the class"); 
    } 
}

public class Class_Object { 
    public static void main(String[] args) { 
        Student sid = new Student(); 
        sid.bunk(); 
        sid.name = "Anant Mishra"; 
        System.out.println(sid.name); 
    } 
}
