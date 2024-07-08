package ISP.AdherenceISP;

public class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating.");
    }
}
