class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super(message);
    }
}

class BankAccount{

    int balance = 5000;

    void withdraw (int amount) throws InsufficientBalanceException{
        if(amount > balance){
                throw new InsufficientBalanceException("insufficient balance ");
        }

        balance = balance - amount ;

        System.out.println("withdrawal successful");
        System.out.println("Remaining balance : "+ balance );

    }
}

public class CustomException {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try{
            account.withdraw(40000);

        } catch(InsufficientBalanceException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
}
