import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animalShelter = new LinkedList<>();

        // Create
        animalShelter.add(new Animal("Lion", 5));
        animalShelter.add(new Animal("Tiger", 4));
        animalShelter.add(new Animal("Elephent", 10));

        // Read
        for (Animal animal : animalShelter) {
            System.out.println(animal);
        }

        // Update
        animalShelter.set(1, new Animal("Panther", 3));
        System.out.println("After Update:");
        for (Animal animal : animalShelter) {
            System.out.println(animal);
        }

        // Delete
        animalShelter.remove(0);
        System.out.println("After Deletion");
        for (Animal animal : animalShelter) {
            System.out.println(animal);
        }
    }
}
