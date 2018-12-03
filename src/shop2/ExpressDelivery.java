package shop2;

public class ExpressDelivery implements Delivery {
    private String town;

    public ExpressDelivery(String town) {
        this.town = town;
    }

    @Override
    public double getPrice() {
        if (town == "Paris") {
            return 6.99;
        } else {
            return 9.99;
        }
    }

    @Override
    public String getInfo() {
        return "livraison express " + this.getPrice() + "€";
    }
}
