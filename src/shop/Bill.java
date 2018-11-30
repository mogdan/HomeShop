package shop;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;

    /**
     * Method to add product to a sale
     *
     * @param product  product to add
     * @param quantity quantity to add for the product
     */
    public void addProduct(Product product, Integer quantity) {
        products.put(product, quantity);

    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Bill(Customer customer) {
        this.customer = customer;
        System.out.println("Vous venez de créer la commande pour le client " + customer.getFullname());
    }
}
