package shop3;

public class RelayDelivery implements Delivery {
    private int relayRef;

    @Override
    public double getPrice() {
        if (relayRef >= 1 && relayRef <= 22) {
            return 0;
        } else if (relayRef >= 23 && relayRef <= 47) {
            return 2.99;
        } else {
            return 4.99;
        }
    }

    @Override
    public String getInfo() {
        return "livraison point relais " + this.getPrice() + "€";
    }
}
