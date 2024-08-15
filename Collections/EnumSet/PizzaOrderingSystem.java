import java.util.EnumSet;

public class PizzaOrderingSystem {

    // Define an 'enum' for pizza toppings
    enum Topping {
        CHEESE, TOMATO, PEPPERONI, MUSHROOM, OLIVE, BELL_PEPPER;
    }

    public static void main(String[] args) {

        // 1. A customer orders a pizza with CHEESE, TOMATO, and PEPPERONI
        EnumSet<Topping> pizzaOrder1 = EnumSet.of(Topping.CHEESE, Topping.TOMATO, Topping.PEPPERONI);
        System.out.println("1. Pizza order with toppings: " + pizzaOrder1);

        // 2. Another customer orders a vegetarian pizza
        EnumSet<Topping> vegPizza = EnumSet.of(Topping.CHEESE, Topping.TOMATO, Topping.MUSHROOM, Topping.OLIVE, Topping.BELL_PEPPER);
        System.out.println("2. Vegetarian pizza with toppings: " + vegPizza);

        // 3. check if a pizza order has a particular topping
        boolean hasMushroom = vegPizza.contains(Topping.MUSHROOM);
        System.out.println("3. Does the vegetarian pizza have mushroom? " + hasMushroom);
    }
}
