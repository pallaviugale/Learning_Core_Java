class propertyTax{


    public double calculateTax(double areaSqFt)
    {
        return areaSqFt * 10 ; 
    }

    public double calculateTax(int  propertyValue)
    {
        return propertyValue * 0.02; 
    }

      public double calculateTax(double areaInSqFt,double ratePerSqFt)
    {
        return areaInSqFt *  ratePerSqFt; 
    }

      public double calculateTax(double propertyValue,int serviceCharge)
    {
        return ( propertyValue *  0.015 ) + serviceCharge; 
    }

}




public class Method_Overloading_Ex {
    public static void main(String[] args) {
        propertyTax pt = new propertyTax();
        
        System.out.println(pt.calculateTax(4));
        System.out.println(pt.calculateTax(50.0));
        System.out.println(pt.calculateTax(5.0,6.0));
        System.out.println(pt.calculateTax(6.0,7.0));

    }
}
