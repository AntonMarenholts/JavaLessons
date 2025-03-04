package hw26;

//Класс Circle (Круг)
//Создайте класс Circle, который наследуется от Shape.
//Добавьте поле radius типа double, которое хранит радиус круга.
//Создайте метод setRadius(double radius), который устанавливает
//значение поля radius.
//Создайте метод calculateArea(), который вычисляет и выводит площадь круга.

public class Circle extends Shape {

    public static final double PI = Math.PI;
    double arrea;
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calculateArea();
    }
    public void calculateArea(){this.arrea = PI * radius * radius;}

    public double getArrea() {
        return arrea;
    }

    public double getRadius() {
        return radius;
    }
}
