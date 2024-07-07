package NestedClasses.StaticNested;

public class OuterClass {
    private static String staticOuterField = "Static Outer Field";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Accessing: " + staticOuterField);
        }
    }
}

class StaticNestedClassExample {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();     // Outputs: Accessing: Static Outer Field
    }
}
