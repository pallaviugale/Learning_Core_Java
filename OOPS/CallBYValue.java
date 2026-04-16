public class CallBYValue {
    public static void changeValue(int num){
        num = 100;
    }
    public static void main(String[] args) {
        
        int num = 10;
        changeValue(num);
        System.out.println(num);

        
    }
}
