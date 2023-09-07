package Jour2.Job05;
public class VoitureExercice {
    private int speed;

    public VoitureExercice(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) throws VitesseLimiteDepasseException{
        if(speed > 130){
            throw new VitesseLimiteDepasseException();
        }
        else{
            this.speed = speed;
        }
    }

    public static void main(String[] args) {
        VoitureExercice voiture = new VoitureExercice(0);
        try{
            voiture.setSpeed(150);
        }
        catch(VitesseLimiteDepasseException e){
            System.out.println(e.getMessage());
        }
    }
}

