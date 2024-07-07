package Object.Abstract;

public class RealWorldExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Motorcycle motorcycle = new Motorcycle("Harley Davidson");

        car.start();        // Outputs: Car Toyota started.
        car.stop();         // Outputs: Vehicle stopped.

        motorcycle.start();     // Outputs: Motorcycle Harley Davidson started.
        motorcycle.stop();      // Outputs: Vehicle stopped.
    }
}
