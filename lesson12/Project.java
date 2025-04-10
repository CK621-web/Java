package lesson12;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful.");
    }
}

public class Project {
    public static void main(String[] args) {
        ATM atm = new ATM(500);
        try {
            atm.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
