package Cohesion.Example_3;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
