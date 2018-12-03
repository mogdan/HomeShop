package shop3;

public class Fridge extends Product {
    private int liter;
    private boolean freeze;

    public Fridge(String name, String description, double price, int liter, boolean freeze) {
        super(name, description, price);
        this.liter = liter;
        this.freeze = freeze;
    }

    public Fridge(String name, String description, double price) {
        super(name, description, price);
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreeze() {
        return freeze;
    }
}
