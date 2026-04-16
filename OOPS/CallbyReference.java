class Test{
    int marks;
}
public class CallbyReference {
    public static void changeMarks (Test s){

        s.marks = 90;
    }
    public static void main(String[] args) {
        Test t = new Test();

        t.marks = 75 ;
        changeMarks(t);
        System.out.println(t.marks);

    }
}
