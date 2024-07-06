package Delegation.Example_2;

public class EpsonPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("Epson Printer: " + message);
    }
}
