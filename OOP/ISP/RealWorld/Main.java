package ISP.RealWorld;

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printer();
        printer.print();   // Output: Printing document.

        Scannable scanner = new Scanner();
        scanner.scan();    // Output: Scanning document.

        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print();    // Output: Printing document.
        allInOnePrinter.scan();     // Output: Scanning document.
        allInOnePrinter.fax();      // Output: Faxing document.
    }
}
