package Coupling.Example_2;

public class Main {
    public static void main(String[] args) {
        Engine dieselEngine = new DieselEngine();
        Car carWithDieselEngine = new Car(dieselEngine);
        carWithDieselEngine.start(); // Output: Diesel Engine started.

        Engine electricEngine = new ElectricEngine();
        Car carWithElectricEngine = new Car(electricEngine);
        carWithElectricEngine.start(); // Output: Electric Engine started.
    }
}
