package shop2;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    Customer customer;
    Map<Product, Integer> products = new HashMap<Product, Integer>();

    public Bill(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
    }
}
