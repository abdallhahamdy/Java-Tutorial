package Inheritance;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: This animal eats food.
        dog.bark(); // Output: The dog barks.

        Cat cat = new Cat();
        cat.eat(); // Output: This animal eats food.
        cat.meow(); // Output: The cat meows.

        // Puppy puppy = new Puppy();
        // puppy.eat(); // Output: This animal eats food.
        // puppy.bark(); // Output: The dog barks.
        // puppy.weep(); // Output: The puppy weeps
    }
}