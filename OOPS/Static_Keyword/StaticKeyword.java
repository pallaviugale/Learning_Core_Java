
public class StaticKeyword {
    static String name ;
    static String dept;

    StaticKeyword(String name){
        this.name = name ;
    }

    static void print(){
        System.out.println("Name :" + name + ", Department :" + dept);
    }

    public static void main(String[] args) {
         StaticKeyword.name = "Pallavi";
         StaticKeyword.dept = "IT";
         StaticKeyword.print();
    }
}