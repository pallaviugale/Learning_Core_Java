

public class Methods {
    public static void main(String[] args) {

        greet();

        sayHello("Pallavi");

        int x = getnumber();
        System.out.println(x);

        
        System.out.println(multiply(5, 5 ));

        
    }


//no i/p,no o/p
static void greet(){
    System.out.println("hello");
}

// i/p,no o/p

static void sayHello(String name){
   
    System.out.println("hello " + name );
}

// no i/p, o/p
static int getnumber(){
    return 10;
}

// i/p,o/p

static int multiply(int a, int b){
    return(a * b) ;
}

}
