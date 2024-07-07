package Abstract;

public class ConstructorExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println("Dog's name: " + dog.getName());     // Outputs: Dog's name: Buddy
        dog.makeSound();    // Outputs: Bark
        dog.eat();          // Outputs: Eating...
    }
}
