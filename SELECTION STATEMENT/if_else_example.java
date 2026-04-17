public class if_else_example {

    public static void main(String[] args) {

        int mark = 85;

        // if(mark >= 90){
        //     System.out.println("A");
        // }
        // else if(mark >= 70){
        //     System.out.println("B");
        // }
        // else if(mark >= 50){
        //     System.out.println("C");
        // }
        // else{
        //     System.out.println("Fail");
        // }
         String result = (mark>=90) ? "A" : (mark>=70) ? "B" : (mark>=50) ?"C": "Fail";
         System.out.println(result);

    }
}
