package Jour1.Job05;

public class JeuDeDes {
    public static void main(String[] args) {
        Des des1 = new Des();
        Des des2 = new Des();

        int result = des1.getValue() + des2.getValue();
        System.out.println("Resultat du lancer de des: " + result);
    }

}
