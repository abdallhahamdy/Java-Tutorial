package ReturnKeyword;

public class ReturnKeyword {
    public static void main(String[] args) {
        Operations addOperation = new AddOperation();
        Operations subOperation = new SubOperation();
        Operations mulOperation = new MultiplyOperation();
        Operations divOperation = new DivisionOperation();

        int add = addOperation.doOperation(10, 20);
        System.out.println("Addition of 10 and 20 ::" + add);

        int sub = subOperation.doOperation(20, 10);
        System.out.println("Subtraction between 20 and 10 ::  " + sub);

        int mul = mulOperation.doOperation(10, 20);
        System.out.println("Multiply 10 and 20 :: " + mul);

        int div = divOperation.doOperation(20, 10);
        System.out.println("Division of 20 by 10 :: " + div);
    }
}

interface Operations {
    public int doOperation(int num1, int num2);
}

class AddOperation implements Operations {

    @Override
    public int doOperation(int num1, int num2) {
        return (num1 + num2);
    }
}

class SubOperation implements Operations {

    @Override
    public int doOperation(int num1, int num2) {
        return (num1 - num2);
    }
}

class MultiplyOperation implements Operations {

    @Override
    public int doOperation(int num1, int num2) {
        return (num1 * num2);
    }
}

class DivisionOperation implements Operations {

    @Override
    public int doOperation(int num1, int num2) {
        return (num1 / num2);
    }
}