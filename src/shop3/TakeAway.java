package shop3;

public class TakeAway implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "enlèvement produit - gratuit";
    }
}
