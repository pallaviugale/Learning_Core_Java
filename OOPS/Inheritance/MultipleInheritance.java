interface AccountOperation {
    void deposit(double amount);
}

interface LoanOperation {
    void applyLoan(double amount);
}

class SmartAccount implements AccountOperation, LoanOperation {

    String name;
    double balance;

    // constructor
    // SmartAccount(String name, double balance) {
    //     this.name = name;
    //     this.balance = balance;
    // }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount + ", New balance: " + balance);
    }

    @Override
    public void applyLoan(double amount) {
        balance += amount;
        System.out.println("Loan credited: " + amount + ", New balance: " + balance);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartAccount acc = new SmartAccount();
        acc.name="Pallavi";
        acc.balance = 1000;
         
        acc.deposit(500);
        acc.applyLoan(2000);
    }
}