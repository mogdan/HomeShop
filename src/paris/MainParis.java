package paris;

public class MainParis {
    public static void main(String[] args) {
        Parisien toto = new Parisien();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        toto.seDeplacer(bus);
        toto.seDeplacer(taxi);
    }
}
