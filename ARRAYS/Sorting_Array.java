// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Sorting_Array {
    public static void main(String[] args) {
        int []num = {160,20,356,460,500};
       
        for ( int i=0;i<num.length;i++){
            for( int j=0;j<num.length-i-1;j++){
                if(num[j] > num[j +1 ]){
                    int temp = num[j];
                    num[j]= num[j + 1];
                    num[j + 1]= temp;
                }
            }
           
            
        }
         for ( int i=0;i<num.length;i++){
             System.out.println(num[i]);
         }

    }
}
