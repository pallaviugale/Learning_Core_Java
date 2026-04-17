public class leap_year {
    public static void main(String[] args) {
//        int year = 2000;
//  String result = ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 ==0))?"Leap year" : "Not leap year";
// System.out.println(result);
        

        int year = 2024;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
