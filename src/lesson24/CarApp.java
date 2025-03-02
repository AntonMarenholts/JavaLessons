package lesson24;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("static fild: " + Car.totalCars);


        Car bmw = new Car("bmw", 200);

        System.out.println("Static totalCars: " + Car.totalCars);

        System.out.println("После создания 1 машины: " + bmw.toString());
        System.out.println("static variable: " + Car.totalCars);

        //Нам следует обращатся к static от имени класса
        //Модификатор static применим только к полям или методам класса

        System.out.println(bmw.toString());

        Car vw = new Car("vw", 300);
        System.out.println(vw.toString());

    }
}
