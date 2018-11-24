package main;

public class Aliment {
    String name;
    boolean estCuit;

    public void manger(){
        if (estCuit)
            System.out.println("L'aliment "+name+" est bien cuit");
        else {
            System.out.println("Beurk! L'aliment "+name+" doît être cuit avant d'être mangé");
        }

    }


}
