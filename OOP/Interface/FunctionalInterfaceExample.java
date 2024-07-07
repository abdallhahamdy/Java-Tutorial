package Interface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Hello, World!");
        greeting.sayHello();    // Outputs: Hello, World!
    }
}
