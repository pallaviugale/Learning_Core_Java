
class Employee{
    String name;
    double salary;

Employee(String name,double salary){
    this.name = name ;
    this.salary = salary;
    System.out.println("constructor executed");
}

void displaydetails(){
    System.out.println("Employee name: " + name + " salary: " + salary);
}
}



public class ParameterizedEX {


    public static void main(String[] args) {
        Employee emp = new Employee("Pallavi",5000);
        emp.displaydetails();

        System.out.println("End program");
    }
}
