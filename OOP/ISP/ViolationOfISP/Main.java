package ISP.ViolationOfISP;

public class Main {
    public static void main(String[] args) {
        Worker developer = new Developer();
        developer.work();   // Output: Developer is coding
        developer.eat();    // Output: Developer is eating

        Worker robot = new Robot();
        robot.work();       // Output: Robot is working.
        robot.eat();        // Throws UnsupportedOperationException
    }
}
