package NestedClasses.LocalInner;

public class OuterClass {
    public void display() {
        String localVariable = "Local Variable";

        // Local inner class
        class LocalInnerClass {
            public void show() {
                System.out.println("Accessing: " + localVariable);
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.show();      // Outputs: Accessing: Local Variable
    }
}

class LocalInnerClassExample {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
