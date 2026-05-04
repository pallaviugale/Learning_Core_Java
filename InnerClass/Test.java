class Outer{
    int x = 10;
    class Inner{
    void display(){
        System.out.println("Print x " + x);
    }
    
    }
}

public class Test {
    public static void main(String[] args) {
        Outer obj  = new Outer();

        Outer.Inner innobj = obj.new Inner();

        innobj.display();


    }
    
}

// class Outer {
//     static int x = 10;

//     static class Inner {
//         void display() {
//             System.out.println("x = " + x);
//         }
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Outer.Inner obj = new Outer.Inner();
//         obj.display();
//     }
// }
