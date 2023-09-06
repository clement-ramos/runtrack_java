package Jour1.Job02;

public class Voiture {
    private String marque;
    private String couleur;
    private int vitesse = 0;

    public void démarrer(){
    System.out.println("La voiture démarre.");
    }
    public void accélérer(){
        this.vitesse += 10;
        System.out.println("La voiture est a " + this.vitesse + " km/h");

    }
    public void freiner(){
        this.vitesse = 0;
        System.out.println("La voiture s'arrêtte.");
    }
}
