
enum Day {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class TestEnum {
    public static void main(String[] args) {
        // Day today = Day . MONDAY ;
       // System.out.println(today);
        Day today = Day . TUESDAY ;
        switch(today){
            case MONDAY :
                System.out.println("Start of week");
                break;
            case TUESDAY :{
                 System.out.println("Second day");
                break;
            }

            case WEDNESDAY :{
                 System.out.println("Mid day");
                break;
            }

            case THURSDAY :{
                 System.out.println("Mid week");
                break;
            }

            case FRIDAY :{
                 System.out.println("End of week ");
                break;
            }

            case SATURDAY :{
                 System.out.println("It's Weekends");
                break;
            }

            case SUNDAY :{
                 System.out.println("It's Weekends");
                break;
            }
        }

    }
}
