package InstanceOfKeyword;

import jdk.dynalink.Operation;
import org.w3c.dom.ls.LSOutput;

public class InstanceOfKeyword2 {
    public static void main(String[] args) {
        Operations addOperation = new AddOperation();
        Operations subOperation = new SubOperation();
        Operations mulOperation = new MultiplyOperation();
        Operations divOperation = new DivisionOperation();

        Calculate calculate = new Calculate();

        calculate.process(addOperation);
        calculate.process(subOperation);
        calculate.process(mulOperation);
        calculate.process(divOperation);

        System.out.println(addOperation instanceof Operations); // true
        System.out.println(subOperation instanceof Operations); // true
        System.out.println(mulOperation instanceof Operations); // true
        System.out.println(divOperation instanceof Operations); // true

        System.out.println(addOperation instanceof Object); // true

        System.out.println(new AddOperation() instanceof Operations);  // true
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

class Calculate {

    public void process(Operations operations) {
        if (operations instanceof AddOperation) {
            operations.doOperation(1, 2);
        }

        if (operations instanceof SubOperation) {
            operations.doOperation(2, 2);
        }

        if (operations instanceof MultiplyOperation) {
            operations.doOperation(2, 2);
        }

        if (operations instanceof DivisionOperation) {
            operations.doOperation(2, 1);
        }
    }
}