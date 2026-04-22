

class Employee {
    String name;
    double baseSalary;

    public double calculateSalary(){
        return baseSalary;
    }

    public void showDetails(){
        System.out.println("Employee : " + name + ", Salary : " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee{
    double bonus;

    @Override
    public double calculateSalary(){
        return baseSalary + bonus ;
    }

     @Override
public void showDetails(){
    System.out.println("Full Time Employee : " + name + ",Salary: " + calculateSalary());
}

}


class PartTimeEmployee extends Employee{
    int hoursWorked;
    double HourlyRate;

    @Override
    public double calculateSalary(){
        return hoursWorked * HourlyRate ;
    }

     @Override
public void showDetails(){
    System.out.println("Part Time Employee : " + name + ",Salary: " + calculateSalary());
}



}

class TemporaryEmployee extends Employee{
    int dailyWorked;
    double dailyRate;

    @Override
    public double calculateSalary(){
        return dailyWorked * dailyRate ;
    }

     @Override
public void showDetails(){
    System.out.println(" Temporary Employee : " + name + ",Salary: " + calculateSalary());
}

}


public class Method_Overriding_Ex {
    public static void main(String[] args) {
       Employee  emp1 = new FullTimeEmployee();
       emp1.name = "Pallavi";
       emp1.baseSalary = 300000;
       ((FullTimeEmployee)emp1).bonus = 5000;
       emp1.showDetails();
    
       Employee  emp2 = new PartTimeEmployee();
       emp2.name = "Chiuuu";
       ((PartTimeEmployee)emp2).hoursWorked = 500;
       ((PartTimeEmployee)emp2).HourlyRate = 500;
        emp2.showDetails();

        Employee  emp3 = new TemporaryEmployee();
       emp3.name = "Tanuja";
       ((TemporaryEmployee)emp3). dailyWorked= 10;
       ((TemporaryEmployee)emp3).dailyRate = 1000;
        emp3.showDetails();


    }
}
