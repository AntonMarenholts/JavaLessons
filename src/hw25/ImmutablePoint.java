package hw25;

public class ImmutablePoint {
    /*
    Создайте класс ImmutablePoint:
 •	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
    */
        private final int X;
        private final int Y;


    public ImmutablePoint(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
}
// Попытка создать методы-сеттеры приведёт к ошибке компиляции
// т.к. нельзя присвоить значение final полю