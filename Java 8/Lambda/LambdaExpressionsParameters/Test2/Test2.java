package LambdaExpressionsParameters.Test2;
// functional interface
// with one parameter of Integer type
public interface Test2 {
    // The void type and the Integer type
    // is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p);
}
