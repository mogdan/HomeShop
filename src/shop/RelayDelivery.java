package shop;

public class RelayDelivery implements Delivery {
    private int relayNumber;

    public RelayDelivery(int relayNumber) {
        this.relayNumber = relayNumber;
    }

    @Override
    public double getPrice() {
        if (relayNumber <= 22 && relayNumber >= 1) {
            System.out.println("La livraison à ce point relais est gratuite");
            return 0;
        } else if (relayNumber <= 47 && relayNumber >= 23) {
            System.out.println("La livraison à ce point relais est de 2.99€");
            return 2.99;
        } else {
            System.out.println("La livraison à ce point relais est de 4.99€");
            return 4.99;
        }
    }
}
