package ISP.AdherenceISP;

public class Main {
    public static void main(String[] args) {
        Workable developer = new Developer();
        developer.work();   // Output: Developer is coding.

        Eatable eatableDeveloper = (Eatable) developer;
        eatableDeveloper.eat();  // Output: Developer is eating

        Workable robot = new Robot();
        robot.work();  // Output: Robot is working
    }
}
