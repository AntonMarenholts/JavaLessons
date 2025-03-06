package lesson28.animals;

public class Hamster extends Animal {

    //Ничего не переопределяю - получаем реализацию всех род. объектов


    // Переопределение метода родителя (Animal)
    @Override
    public String toString() {
        return "Hamster!";
    }
}
