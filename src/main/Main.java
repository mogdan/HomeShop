package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Démarrage du test");
        System.out.println("");
        Four four = new Four();
        four.capacite = 40;
        four.puissance = 260;

        Aliment aliment = new Aliment();
        aliment.name = "Poulet";
        aliment.estCuit = false;
        aliment.manger();
        System.out.println("");
        four.cuire(aliment);
        System.out.println("");
        aliment.manger();
    }

}
