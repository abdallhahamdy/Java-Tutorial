package LambdaExpressionsParameters.Test4;

public class GFG {
    public static void main(String[] args) {
        // The lambda expression here determines if one number is the factor of another
        Test4 isFactor = (n,d) -> (n%d)==0;
        if (isFactor.test(10,2))
            System.out.println("2 is the factor of 10");

        if (!isFactor.test(10,3))
            System.out.println("3 is not a factor of 10");
    }
}
