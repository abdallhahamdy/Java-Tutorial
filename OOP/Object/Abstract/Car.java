package Object.Abstract;

public class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Car " + getModel() + " started.");
    }
}
