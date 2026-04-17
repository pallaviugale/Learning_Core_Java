

class Employee{
    String name;
    double salary;

Employee(String name,double salary){
    this.name = name ;
    this.salary = salary;
    System.out.println("constructor executed");
}

Employee(Employee emp){
    this.name = emp.name ;
    this.salary = emp.salary;
    System.out.println("constructor executed");
}



void displaydetails(){
    System.out.println("Employee name: " + name + " salary: " + salary);
}
}



public class CopyEx {


    public static void main(String[] args) {
        Employee emp = new Employee("Pallavi",5000);
        emp.displaydetails();

        Employee emp1 = new Employee(emp);

        emp1.displaydetails();

        emp1.name = "Pankaj";
        emp1.displaydetails();


        System.out.println("End program");
    }
}
