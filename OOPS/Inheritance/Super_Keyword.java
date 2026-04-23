class Parent {
    String name = "parent";
}


class Child extends Parent  {
    String name = "child";

    void show(){
        System.out.println(name);
        System.out.println(super.name);
    }
}

class Employee {
    String company;

    // parent constructor 
    Employee(String company) {
        this.company = company;
        System.out.println("Employee Constructor called");
    }

    void getDetails() {
        System.out.println("Company: " + company);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String company, String department) {
        super(company);  // call parent constructor
        this.department = department;
        System.out.println("Manager Constructor called");

    }

    void getFullDetails() {
        super.getDetails();  // call parent method
        System.out.println("Department: " + department);
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Manager manager = new Manager("MAQ", "IT");
        manager.getFullDetails();
        Child c = new Child();
        c.show();
    
    }
}