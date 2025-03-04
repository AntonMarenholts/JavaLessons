package hw26;

//Класс Rectangle (Прямоугольник)
//Создайте класс Rectangle, который наследуется от Shape.
//Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
//Создайте метод setDimensions(double width, double height),
// который устанавливает значения полей width и height.
//Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.

public class Rectangle extends Shape{

    private double width;
    private double height;
    private double arrea;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
        calculateArrea();
    }

    private void calculateArrea() {this.arrea = width * height;}

    public double getArrea() {
        return arrea;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }



}
