package shop;

public class Product {
    private String name = "default";
    private String description = "default";
    private double price = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Look full description of the product
     */
    public void look(){

    }

    /**
     * Set a sale
     * @param bill bill associated with the sale
     * @param quantity quantity to add to the sale
     */
    public void buy(Bill bill,Integer quantity){

    }

    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
        //System.out.println("Vous venez de créer le produit (" + name + " / " + description + ") au prix de " + price + "€");
    }
}
