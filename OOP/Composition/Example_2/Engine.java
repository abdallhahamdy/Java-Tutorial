package Composition.Example_2;

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Car stopped.");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
        car.stopCar();
    }
}