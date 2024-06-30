package Polymorphism;

interface Payment {
    void pay();
}

class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using cash.");
    }
}

class CreditPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using credit card.");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Payment payment;

        payment = new CashPayment();
        payment.pay();  // Output: Payment made using cash.

        payment = new CreditPayment();
        payment.pay();  // Output: Payment made using credit card.
    }
}