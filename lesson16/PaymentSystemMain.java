
class Payment {
    public void processPayment() {
        System.out.println("Processing Generic payment");

    }

    public void processPayment(double amount) {
        System.out.println("Processing Generic payement for $" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Credit card payment");

    }

    public void processPayment(String cardType, double amount) {
        System.out.println("Processing" + cardType + " payement for $" + amount);
    }

}

class PaypalPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Paypal payment");

    }
}

public class PaymentSystemMain {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PaypalPayment();

        creditCardPayment.processPayment();
        paypalPayment.processPayment();

        creditCardPayment.processPayment(3000);
    }
}
