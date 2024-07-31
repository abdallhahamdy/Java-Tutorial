package LambdaExpressionsParameters.Test3;

// functional interface Test3
// with 2 parameter of Integer type
public interface Test3 {
    // The void type and the Integer type
    // is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p1, Integer p2);
}
