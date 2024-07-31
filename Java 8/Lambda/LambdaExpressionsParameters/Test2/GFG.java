package LambdaExpressionsParameters.Test2;


public class GFG {
    // takes lambda expression and a variable of
    // Integer type as arguments
    static void fun(Test2 t, Integer p)
    {
        // calls the print function
        t.print(p);
    }

    public static void main(String[] args) {
        // lambda expression is passed
        // with a single parameter
        // lambda expression is mapped to the
        // single argument abstract function in the
        // functional interface Test2
        fun(p -> System.out.println(p), 10);
    }
}
