class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");

        while (this.amount < amount) {
            System.out.println("Less balance, waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.amount -= amount;
        System.out.println("Withdraw completed. Remaining balance: " + this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit...");
        this.amount += amount;
        System.out.println("Deposit completed. Current balance: " + this.amount);
        notify();
    }
}

public class InterthreadCommunicationEx {
    public static void main(String[] args) {
        Customer c = new Customer();

        // Withdraw thread
        new Thread(() -> {
            c.withdraw(15000);
        }).start();

        // Deposit thread
        new Thread(() -> {
            c.deposit(15000);
        }).start();
    }
}