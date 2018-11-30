package shop;

public class ExpressDelivery implements Delivery {
    private String deliveryAddress;

    public ExpressDelivery(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public double getPrice() {
        if (deliveryAddress == "Paris") {
            System.out.println(" La livraison express à Paris est de 6.99€");
            return 6.99;
        } else {
            System.out.println("La livraison express hors Paris est de 9.99€");
            return 9.99;
        }
    }
}
