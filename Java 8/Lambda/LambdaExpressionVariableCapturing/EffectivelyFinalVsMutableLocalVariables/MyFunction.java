package LambdaExpressionVariableCapturing.EffectivelyFinalVsMutableLocalVariables;

// Java Program Illustrating Difference between
// Effectively final and Mutable Local Variables

// Importing required classes
import java.io.*;
// An example of capturing a local variable from the
// enclosing scope

// Interface
public interface MyFunction {

    // Method inside the interface
    int func(int n);
}

// Main class
class GFG {
    // Main driver method
    public static void main(String[] args) {
        // custom local variable that can be captured
        int number = 10;

        MyFunction myLambda = (n) ->
        {
            // This use of number is ok It does not modify
            // num
            int value = number + n;

            // However, the following is illegal because it
            // attempts to modify the value of number

            // number++
            return value;
        };

        System.out.println(myLambda.func(20));
        System.out.println("GFG!");
    }
}
