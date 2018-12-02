package shop;

public class ExpressDelivery implements Delivery {
    private String deliveryAddress;

    public ExpressDelivery(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public double getPrice() {
        if (deliveryAddress == "Paris") {

            return 6.99;
        } else {

            return 9.99;
        }
    }

    @Override
    public String getInfo() {
        if (deliveryAddress.equals("Paris"))
            return "livraison express Paris";
        else return "livraison express hors Paris";
    }
}
