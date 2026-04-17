class Student {
    private int id;
    private String name;

    // setter for id
    public void setId(int id) {
        this.id = id;
    }

    // getter for id
    public int getId() {
        return id;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for name
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // set values
        s.setId(101);
        s.setName("Pallavi");

        // get values
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}