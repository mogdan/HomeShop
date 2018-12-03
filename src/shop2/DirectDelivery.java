package shop2;

public class DirectDelivery implements Delivery {

    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison normale 4.99€";
    }
}
