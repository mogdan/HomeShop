package paris;

public class Taxi implements MoyenDeLocomotion {

    @Override
    public void deplacer(String lieu) {
        System.out.println("Je suis un taxi et je vais à " + lieu);

    }
}
