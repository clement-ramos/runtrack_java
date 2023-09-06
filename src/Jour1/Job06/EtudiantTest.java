package Jour1.Job06;

public class EtudiantTest {
    public static void main(String[] args) {
        Etudiant Bob = new Etudiant("Bob", new int[]{10, 12, 14, 16, 18});
        Bob.showNotes();
        System.out.println("The highest note is : " + Bob.highestNote());
        System.out.println("The lowest note is : " + Bob.lowestNote());
        System.out.println("The average note is : " + Bob.averageNote());
        Bob.addNote(19);
        Bob.showNotes();
        System.out.println("The highest note is : " + Bob.highestNote());
        System.out.println("The lowest note is : " + Bob.lowestNote());
        System.out.println("The average note is : " + Bob.averageNote());
    }
}
