class BankAccount{
    private double Balance;
    private String AcHolderName;

    // constructor
BankAccount(double Balance,String AcHolderName){
    this.Balance = Balance ;
    this.AcHolderName = AcHolderName ;
}

public double getBalance(){
    return Balance;
}

public String getAcHolderName(){
    return AcHolderName;
}

public void deposite(double amount){
    if(amount >0){
        Balance += amount  ;
        System.out.println("deposited amount :  " + amount  + " New balance " + Balance);

    } 
   
}

public void withdraw(double amount){
    Balance -= amount  ;
     System.out.println("withdraw  amount : " + amount  + " New balance " + Balance);
};

}
 





public class Encapsulation {
    public static void main(String[] args) {
        
        BankAccount b = new BankAccount(1000, "Pallavi");

        b.deposite(500);
        b.withdraw(400);

        b.getAcHolderName();
        b.getBalance();
        System.out.println(b.getAcHolderName());
        System.out.println(b.getBalance());
    }
    
}
