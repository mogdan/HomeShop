package shop;

public class TakeAway implements Delivery {
    @Override
    public double getPrice() {
        System.out.println("L'enlèvement est gratuit");
        return 0;
    }
}
