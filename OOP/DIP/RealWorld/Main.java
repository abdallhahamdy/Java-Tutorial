package DIP.RealWorld;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new CreditCardPaymentProcessor();
        PaymentService paymentService = new PaymentService(creditCardPayment);
        paymentService.makePayment(100.0);  // Output: Processing credit card payment of $100.0

        PaymentProcessor paypalPayment = new PayPalPaymentProcessor();
        paymentService = new PaymentService(paypalPayment);
        paymentService.makePayment(200.0);  // Output: Processing PayPal payment of $200.0
    }
}
