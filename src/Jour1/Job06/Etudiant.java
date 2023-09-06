package Jour1.Job06;

public class Etudiant {
    private String nom;
    private  int[] notes;
    public  Etudiant(String nom, int[] notes){
        this.nom = nom;
        this.notes = notes;
    }
    public int addNote(int note){
        int[] newNotes = new int[notes.length + 1];
        for (int i = 0; i < notes.length; i++) {
            newNotes[i] = notes[i];
        }
        newNotes[notes.length] = note;
        notes = newNotes;
        return note;
    }

    public int highestNote(){
        int highest = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > highest){
                highest = notes[i];
            }
        }
        return highest;
    }

    public int lowestNote(){
        int lowest = 20;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < lowest){
                lowest = notes[i];
            }
        }
        return lowest;
    }

    public float averageNote(){
           float average = 0;
            for (int i = 0; i < notes.length; i++) {
                average += notes[i];
            }
            return average / notes.length;
    }
    public void showNotes(){
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }
    }
}
