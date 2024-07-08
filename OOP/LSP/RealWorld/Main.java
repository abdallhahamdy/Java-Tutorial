package LSP.RealWorld;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.processPayment(100.0);  // Output: Processing credit card payment of $100

        payment = new PayPalPayment();
        payment.processPayment(200.0);  // Output: Processing PayPal payment of $200.0
    }
}
