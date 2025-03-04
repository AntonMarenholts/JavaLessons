package hw26;

//Базовый класс Shape
//Создайте класс Shape.
//Добавьте поле name типа String, которое хранит название фигуры.
//Создайте метод displayInfo(),
//который выводит на экран значение поля name.

public class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String displayInfo(){
        return "Форма вашей фигуры: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
