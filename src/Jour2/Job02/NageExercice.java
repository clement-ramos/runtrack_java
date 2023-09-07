package Jour2.Job02;

public class NageExercice {

    static class Homme implements Nageur{
        public void nager(){
            System.out.println("L'homme nage.");
        }
    }

    static class Poisson implements Nageur{
        public void nager(){
            System.out.println("Le poisson nage rapidement.");
        }
    }

    public static void main(String[] args) {
        Homme Homme = new Homme();
        Poisson Poisson = new Poisson();

        Homme.nager();
        Poisson.nager();
    }
}

