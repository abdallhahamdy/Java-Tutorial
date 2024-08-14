import java.util.TreeSet;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name); // comparing based on name
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}


public class Main {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
