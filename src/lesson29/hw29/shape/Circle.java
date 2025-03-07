package lesson29.hw29.shape;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArrea() {
        return Math.PI * radius * radius;

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;

    }
}
