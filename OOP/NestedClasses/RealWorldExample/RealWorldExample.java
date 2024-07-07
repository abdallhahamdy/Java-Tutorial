package NestedClasses.RealWorldExample;

public class RealWorldExample {
    public static void main(String[] args) {
        // Static nested class usage
        Computer.Processor processor = new Computer.Processor();
        System.out.println("Processor Model: " + processor.getModel());  // Outputs: Processor Model: Intel i9

        // Inner class usage
        Computer computer = new Computer();
        Computer.RAM ram = computer.new RAM();
        System.out.println("RAM Size: " + ram.getSize());  // Outputs: RAM Size: 16GB
        System.out.println("Computer Brand: " + ram.getBrand());

        // Local inner class usage
        computer.startComputer();
    }
}
