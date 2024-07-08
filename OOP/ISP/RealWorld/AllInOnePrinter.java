package ISP.RealWorld;

public class AllInOnePrinter implements Printable, Scannable, Faxable {
    @Override
    public void print() {
        System.out.println("Scanning document.");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document.");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document.");
    }
}
