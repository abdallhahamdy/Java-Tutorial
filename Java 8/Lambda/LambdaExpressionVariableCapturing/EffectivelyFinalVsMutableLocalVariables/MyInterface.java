package LambdaExpressionVariableCapturing.EffectivelyFinalVsMutableLocalVariables;

// Java Program Illustrating Lambda Expression with Instance Variables

// Interface
public interface MyInterface {
    void myFunction();
}

// Main class
class GFG2 {
    // Custom initialization
    int data = 170;

    // Main driver method
    public static void main(String[] args) {
        // Creating object of this class
        GFG2 gfg = new GFG2();

        // Creating object of interface
        MyInterface intFace = () -> {
            System.out.println("Data: " + gfg.data);
            gfg.data += 500;
            System.out.println("Data after modification: " + gfg.data);
        };

        // Using the Lambda expression
        intFace.myFunction();

        // Modifying the instance variable
        gfg.data += 200;
        System.out.println("Final Data: " + gfg.data);
    }
}
