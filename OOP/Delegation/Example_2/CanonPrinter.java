package Delegation.Example_2;

public class CanonPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("Canon Printer: " + message);
    }
}
