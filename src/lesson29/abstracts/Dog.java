package lesson29.abstracts;

// Если потомок реализовал НЕ все методы родителя,то такой класс должен
//быть объявлен как абстрактный

public abstract class Dog extends Animal{
    @Override
    void move() {
        System.out.println("Dog move");

    }
}
