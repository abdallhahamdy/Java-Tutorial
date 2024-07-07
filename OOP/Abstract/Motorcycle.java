package Abstract;

public class Motorcycle extends Vehicle {
    public Motorcycle(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + getModel() + " started.");
    }
}
