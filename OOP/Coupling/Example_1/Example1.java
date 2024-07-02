package Coupling.Example_1;

public class Example1 {
    class Engine {
        public void start() {
            System.out.println("Engine started.");
        }
    }

    class Car {
        private Engine engine;

        public Car() {
            this.engine = new Engine(); // Direct instantiation
        }

        public void start() {
            engine.start();
        }
    }



}
