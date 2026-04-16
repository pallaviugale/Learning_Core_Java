 public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee();

        Employee tanuja = new Employee();

        Employee rutu = new Employee();



        // System.out.println(obj.id);
        // System.out.println(obj.name);
        // System.out.println(obj.salary);

        obj.id = 1;
        obj.name = "Pallavi";
        obj.salary = 40000.78f;

        // System.out.println(obj.id);
        // System.out.println(obj.name);
        // System.out.println(obj.salary);

        tanuja.id =2;
        tanuja.name = "Tanuja";
        tanuja.salary= 78000.78f;

        // System.out.println(tanuja.id);
        // System.out.println(tanuja.name);
        // System.out.println(tanuja.salary);

         rutu.id =3;
        rutu.name = "rutuja";
        rutu.salary= 30000.78f;


        obj.printDetails();
        tanuja.printDetails();
        rutu.printDetails();
        
    }
    
}

class Employee {
    int id;
    String name;
    float salary;

    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

    }
}
    













