package Abstract;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("Eating...");
    }
}
