//base class
class Account {
    String accountHolderName ;
    double balance ;


void deposit(double amount ){

     balance =  balance + amount ;
     System.out.println(balance);
}

}

// derived class
class SavingAccount extends Account{
    double interestRate;

    void applyInterest() {
        double interest = balance  * interestRate/100;

        balance = balance + interest ;
        System.out.println(balance);
    }
}





public class SingleInheritance {
   public static void main(String[] args) {

    SavingAccount obj = new SavingAccount();
    obj.accountHolderName = "Pallavi";
    obj.balance= 1000.0;
    obj.interestRate=5.0;
    obj.deposit(500.0);
    obj.applyInterest();
    
   } 
}
