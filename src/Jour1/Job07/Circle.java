package Jour1.Job07;

public class Circle {
    private int ray;

    public void setRay(int ray) {
        this.ray = ray;
        System.out.println("The ray is set to : " + ray);
    }

    public float calculateSurface(){
        return (float) (Math.PI * ray * ray);
    }
}
