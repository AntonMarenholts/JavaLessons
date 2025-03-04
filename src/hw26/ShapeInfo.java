package hw26;

public class ShapeInfo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Прямоугольник", 12,24);

        System.out.println("Название фигуры: " + rectangle.getName());
        System.out.println("Площадь фигуры: " + rectangle.getArrea());
        System.out.println("Длинна прямоугольника: " + rectangle.getWidth());
        System.out.println("Высота прямоугольника: " + rectangle.getHeight());

        System.out.println("\n====================\n");

        Circle circle = new Circle("Круг",23);
        System.out.println("Название фигуры: " + circle.getName());
        System.out.println("Площадь круга: " + circle.getArrea());
        System.out.println("Радиус круга: " + circle.getRadius());



    }
}
