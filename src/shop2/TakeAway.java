package shop2;

public class TakeAway implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "enlèvement gratuit";
    }
}
