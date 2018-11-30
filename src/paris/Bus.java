package paris;

public class Bus implements MoyenDeLocomotion {
    @Override
    public void deplacer(String lieu) {
        System.out.println("Je suis un bus et je vais à " + lieu);

    }
}
