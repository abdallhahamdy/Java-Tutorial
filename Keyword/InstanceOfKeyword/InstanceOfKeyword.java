package InstanceOfKeyword;

/**
 * Class demonstrates the usage of instanceof keyword
 * @author Abdallha
 *
 */
public class InstanceOfKeyword {

    public static void main(String[] args) {
        Pizza pizza = new VegPizza();
        Pizza nonPizza = new NonVegPizza();
        test(pizza);
        test(nonPizza);
    }

    private static void test(Pizza pizza) {
        if (pizza instanceof VegPizza) {
            pizza.bake();
        }

        if (pizza instanceof NonVegPizza) {
            pizza.bake();
        }
    }
}

interface Pizza {
    public void bake();
}

class VegPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Bake Veg Pizza");
    }
}

class NonVegPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Bake Non-Veg Pizza");
    }
}