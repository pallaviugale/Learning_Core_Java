package Inheritance;

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

    Manager(String company, String department) {
        super(company);  // call parent constructor
        this.department = department;
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
    }
}