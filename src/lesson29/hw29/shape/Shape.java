package lesson29.hw29.shape;

/*
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

public abstract class Shape {

    abstract double getArrea();
    abstract double getPerimeter();


}
