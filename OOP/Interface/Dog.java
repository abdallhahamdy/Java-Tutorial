package Interface;

public class Dog implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}