package NestedClasses.RealWorldExample;

public class Computer {
    private String brand = "Brand Name";

    // Static nested class
    public static class Processor {
        private String model = "Intel i9";

        public String getModel() {
            return model;
        }
    }

    // Inner class
    public class RAM {
        private String size = "16GB";

        public String getSize() {
            return size;
        }

        public String getBrand() {
            return brand;   // Accessing outer class field
        }
    }

    // Method with local inner class
    public void startComputer() {
        String status = "Starting";

        class Power {
            public void turnOn() {
                System.out.println(status);    // Accessing local variable
            }
        }

        Power power = new Power();
        power.turnOn();
    }
}
