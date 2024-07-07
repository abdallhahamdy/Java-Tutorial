package NestedClasses.NonStaticNested;

public class OuterClass {
    private String outerField = "Outer Field";

    // Inner class
    public class InnerClass {
        public void display() {
            System.out.println("Accessing: " + outerField);
        }
    }
}

class InnerClassExample {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();   // Outputs: Accessing: Outer Field
    }
}
