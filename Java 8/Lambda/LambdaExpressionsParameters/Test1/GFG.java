package LambdaExpressionsParameters.Test1;

public class GFG {
    // Functional interface parameter is passed
    static void fun(Test1 t) { t.print(); }
    public static void main(String[] args) {
        // Lambda expression is passed
        // without parameter to functional interface t
        fun(() -> System.out.println("Hello"));
    }
}
