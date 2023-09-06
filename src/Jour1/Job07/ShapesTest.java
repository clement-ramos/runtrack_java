package Jour1.Job07;

public class ShapesTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRay(5);
        System.out.println("The surface of the circle is : " + circle.calculateSurface());
        square square = new square();
        square.setLength(4);
        System.out.println("The surface of the square is : " + square.calculateSurface());
    }
}
