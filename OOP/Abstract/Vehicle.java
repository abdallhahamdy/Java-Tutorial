package Abstract;

public abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}
