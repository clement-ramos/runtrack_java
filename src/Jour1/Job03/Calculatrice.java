package Jour1.Job03;

import java.util.Scanner;

public class Calculatrice {
    private float nb1;
    private float nb2;

    public void Somme(){
        float result = this.nb1 + this.nb2;
        System.out.println("Somme : " + result);
    }
    public void Différence(){
        float result = this.nb1 - this.nb2;
        System.out.println("Différence : " + result);
    }
    public void Produit(){
        float result = this.nb1 * this.nb2;
        System.out.println("Produit : " + result);
    }
    public void Division(){
        float result = this.nb1 / this.nb2;
        System.out.println("Division : " + result);
    }

    public static void main(String[] args) {
        Calculatrice calcu = new Calculatrice();

        System.out.println("Veuillez saisir le premier nombre: ");
        Scanner input1 = new Scanner(System.in);
        calcu.nb1 = input1.nextFloat();

        System.out.println("Veuillez saisir le second nombre: ");
        Scanner input2 = new Scanner(System.in);
        calcu.nb2 = input2.nextFloat();

        calcu.Somme();
        calcu.Différence();
        calcu.Produit();
        calcu.Division();

    }
}
