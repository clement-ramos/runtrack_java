package Jour2.Job03;

public class AnimalExercice {


    abstract static class Animal{
        abstract void faireDuBruit();
    }
    static class Chat extends Animal{
        public void faireDuBruit(){
            System.out.println("Le chat fait Miaou.");
        }
    }
    static class Chien extends Animal{
        public void faireDuBruit(){
            System.out.println("Le chien fait Ouaf.");
        }
    }
    static class Oiseau extends Animal{
        public void faireDuBruit(){
            System.out.println("L'oiseau fait Cui-cui.");
        }
    }

    public static void main(String[] args) {
        Chat Chat = new Chat();
        Chien Chien = new Chien();
        Oiseau Oiseau = new Oiseau();

        Chat.faireDuBruit();
        Chien.faireDuBruit();
        Oiseau.faireDuBruit();
    }
}
