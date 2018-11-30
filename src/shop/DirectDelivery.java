package shop;

public class DirectDelivery implements Delivery {

    @Override
    public double getPrice() {
        System.out.println(" Le prix de la livraison à domicile est de 4.99€");
        return 4.99;
    }
}
