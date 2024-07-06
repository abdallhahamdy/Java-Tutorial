package Delegation.Example_2;

public class App {

    public static final String MESSAGE_TO_PRINT = "hello world";

    public static void main(String[] args) {
        PrinterController hpPrinterController = new PrinterController(new HpPrinter());
        PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print(MESSAGE_TO_PRINT);    // Output: HP Printer: hello world
        canonPrinterController.print(MESSAGE_TO_PRINT); // Output: Canon Printer: hello world
        epsonPrinterController.print(MESSAGE_TO_PRINT); // Output: Epson Printer: hello world
    }
}
