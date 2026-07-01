import java.util.*;
class employees{
    private int id ;
    private String name;
    public void setid(int id ){
        this.id =  id;
    }
    public void setname (String name ){
        this.name = name ;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        employees emp = new employees();
        emp.setid(100);
        emp.setname("Anant");
        System.out.println("Employees id : " + emp.getId());
        System.out.println("Employees Name : " + emp.getName());
    }
    
}
