class Account {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + " New Balance: " + balance);
    }
}


class SavingAccount extends Account {
    void showBalance() {
        System.out.println("Saving Balance: " + balance);
    }
}


class CurrentAccount extends Account {
    double overdraftLimit = 2000;

    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdraw successful: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Cannot withdraw! Limit exceeded.");
        }
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {

   

        CurrentAccount ca = new CurrentAccount();
        ca.accountHolder = "Harshada";
        ca.balance = 2000;

        ca.withdraw(500); 
        ca.withdraw(3500); 
    }
}
