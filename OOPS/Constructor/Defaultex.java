class Student {
    int marks;

    // Constructor
    Student() {
        marks = 50;
    }
}

public class Defaultex {
    public static void main(String[] args) {
        Student s = new Student();  // constructor called
        System.out.println(s.marks);
    }
}
