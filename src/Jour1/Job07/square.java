package Jour1.Job07;

public class square {
    private int length;

    public void setLength(int length) {
        this.length = length;
        System.out.println("The ray is set to : " + length);
    }
    public float calculateSurface(){
        return length * length;
    }
}
