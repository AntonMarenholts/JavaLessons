package lesson30.interfaces;


// Интерфейс содержит только поведение, которое

public interface Printable {

    // Интерфейс - это набор абстрактных методов, задающих поведение
    // Интерфейс - косвенно абстрактный. Ключевое слово abstract присутствует по умолчанию в объявлении интерфейса.

    //Могут быть константы(public static final)
    public static final String color ="black";

    // Все методы интерфейса косвенно(не явные по умолчанию) и абстрактные и публичные
    // public abstract
    void print();

    // Начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)

    default void defaultMetod(){
        System.out.println("DefaultMethod");
    }
    // Начиная с JDK 8 доступны статические методы
    static void testStaticMethod(String str){
        System.out.println("Static method: " + str);

    }

    // с JDK 9 появились приватные методы (статические и нестатические)
    // Переопределить НЕВОЗМОЖНО

}
