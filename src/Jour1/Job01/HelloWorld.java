package Jour1.Job01;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Veuillez saisir votre nom: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello, " + name);
    }
}
