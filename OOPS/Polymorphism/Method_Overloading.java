
 
class Calculator{

    int add(int a,int b){
        return a + b;
    }
 
    int add(int a,int b,int c){
        return a + b + c ;
    }

    double add(double  a,double  b){
        return a + b;
    }



}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println( c.add(50, 40));
        System.out.println(c.add(3,4,5));
       System.out.println(c.add(12.97, 40.67));

    }
}
