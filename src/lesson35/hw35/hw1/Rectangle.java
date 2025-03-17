package lesson35.hw35.hw1;

import java.util.Objects;

public class Rectangle {

    /*
    Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

length (длина) — тип double
width (ширина) — тип double
Требования:
Конструкторы:
Создайте конструктор, который инициализирует оба поля класса.
Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.
Методы:
Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате:
"Прямоугольник [длина=..., ширина=...]".
Метод main():
В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().
     */

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник [" +
                "длинна =" + length +
                ", ширина =" + width +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2.3, 30.4);
        Rectangle rectangle1 = new Rectangle(34.3, 56.4);
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle(2.3, 30.4);

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);



        System.out.println(rectangle.equals(rectangle3)); // Должно быть true
        System.out.println(rectangle2.equals(rectangle3)); // Должно быть false

    }


}
