package main;

public class Four {
    int puissance;
    int capacite;

    public void cuire(Aliment aliment){
        System.out.println("Le four ("+puissance+"W / "+capacite+"L) cuit l'aliment "+aliment.name);
        aliment.estCuit = true;
    }
}
