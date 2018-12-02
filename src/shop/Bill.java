package shop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
        System.out.println("Vous venez de créer la commande pour le client " + customer.getFullname());
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    /**
     * Method to add product to a sale
     *
     * @param product  product to add
     * @param quantity quantity to add for the product
     */
    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, 1);
        System.out.println("Vous venez de rajouter " + product.getName() + " en " + quantity + " exemplaire(s)");

    }

    public void generate(Writer writer) {

    }

    public double getTotal() {
        return 0;

    }
}
