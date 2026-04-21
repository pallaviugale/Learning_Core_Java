class Account {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + " New balance: " + balance);
    }
}

class SavingAccount extends Account {
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Applied: " + interest + " New Balance: " + balance);
    }
}

class PremiumSavingAcc extends SavingAccount {
    double bonus;

    void applyBonus() {
        double bonusAmount = balance * bonus / 100;
        balance += bonusAmount;
        System.out.println("Bonus applied: " + bonusAmount + " to " + accountHolder + 
                           " New Balance: " + balance);
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount();
        sa.accountHolder = "Harshada";
        sa.balance = 1000;
        sa.interestRate = 5;
        sa.deposit(500);
        sa.applyInterest();

        System.out.println("------");

        PremiumSavingAcc psa = new PremiumSavingAcc();
        psa.accountHolder = "Harshada";
        psa.balance = 2000;
        psa.interestRate = 5;
        psa.bonus = 2;
        psa.deposit(1000);
        psa.applyInterest();
        psa.applyBonus();
    }
}