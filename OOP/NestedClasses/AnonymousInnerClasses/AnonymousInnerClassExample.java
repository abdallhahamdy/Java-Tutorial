package NestedClasses.AnonymousInnerClasses;

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        greeting.sayHello();    // Outputs: Hello from Anonymous Inner Class
    }
}
