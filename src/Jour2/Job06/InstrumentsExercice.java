package Jour2.Job06;

public class InstrumentsExercice {
    static class Guitare implements Instrument{
        public void jouer(){
            System.out.println("La guitare joue un air rock.");
        }
    }

    static class Piano implements Instrument{
        public void jouer(){
            System.out.println("Le piano joue une mélodie douce.");
        }
    }

    public static void main(String[] args) {
        Guitare guitare = new Guitare();
        Piano piano = new Piano();
        guitare.jouer();
        piano.jouer();
    }
}
