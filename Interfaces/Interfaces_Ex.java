import java.util.Scanner;



 interface Payment {
     void PaymentProcess(double amount);
     void GenerateReceipt();
}

// Credit Card
class CreditCardPayment implements Payment {
    private final String creditcardNo;

    public CreditCardPayment(String creditcardNo) {
        this.creditcardNo = creditcardNo;
    }

    @Override
    public void PaymentProcess(double amount) {
        System.out.println("Processing payment of " + amount + " using Credit Card: " + creditcardNo);
    }

    @Override
    public void GenerateReceipt() {
        System.out.println("Credit Card Receipt Generated");
    }
}

// UPI
class UpiPayment implements  Payment {
    private final String upiID;

    public UpiPayment(String upiID) {
        this.upiID = upiID;
    }

    @Override
    public void PaymentProcess(double amount) {
        System.out.println("Processing payment of " + amount + " using UPI: " + upiID);
    }

    @Override
    public void GenerateReceipt() {
        System.out.println("UPI Receipt Generated");
    }
}

// Net Banking
class NetBankingPayment implements Payment {
    private final String userID;

    public NetBankingPayment(String userID) {
        this.userID = userID;
    }

    @Override
    public void PaymentProcess(double amount) {
        System.out.println("Processing payment of " + amount + " using Net Banking User ID: " + userID);
    }

    @Override
    public void GenerateReceipt() {
        System.out.println("Net Banking Receipt Generated");
    }
}

// Service class
class PaymentService {
    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.PaymentProcess(amount);
        payment.GenerateReceipt();
    }
}

public class Interfaces_Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Method: 1. Credit Card  2. UPI  3. Net Banking");
        int choice = scanner.nextInt();
        scanner.nextLine(); // FIX for nextLine()

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // FIX

        Payment payment;

        switch (choice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.nextLine();
                payment = new CreditCardPayment(cardNumber);
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                payment = new UpiPayment(upiId);
                break;

            case 3:
                System.out.print("Enter Net Banking User ID: ");
                String userId = scanner.nextLine();
                payment = new NetBankingPayment(userId);
                break;

            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        PaymentService service = new PaymentService(payment);
        service.executePayment(amount);

        scanner.close();
    }
}