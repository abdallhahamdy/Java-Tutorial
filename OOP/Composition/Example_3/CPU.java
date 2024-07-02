package Composition.Example_3;

class CPU {
    public void process() {
        System.out.println("CPU processing...");
    }
}

class RAM {
    public void load() {
        System.out.println("RAM loading...");
    }
}

class HardDrive {
    public void readData() {
        System.out.println("HardDrive reading data...");
    }
}

class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.process();
        ram.load();
        hardDrive.readData();
        System.out.println("Computer started.");
    }
}

class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
