package shop;

public class RelayDelivery implements Delivery {
    private int relayNumber;

    public RelayDelivery(int relayNumber) {
        this.relayNumber = relayNumber;
    }

    @Override
    public double getPrice() {
        if (relayNumber <= 22 && relayNumber >= 1) {

            return 0;
        } else if (relayNumber <= 47 && relayNumber >= 23) {

            return 2.99;
        } else {
            return 4.99;
        }
    }

    @Override
    public String getInfo() {
        return "livraison point relais";
    }
}
