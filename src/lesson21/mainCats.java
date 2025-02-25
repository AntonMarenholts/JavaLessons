package lesson21;

public class mainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); //Создание нового объекта класса кот
        // 1. физически создаётся объект типа Cat в памяти
        // 2. Вызывается конструктор класса
        //  для инициализации свойств объекта (заполнения полей значениями)


        // При создании объекта все его поля инициализируются какими-то значениями
        // По умолчанию ,если не задано другое поведение, поля инизиализируются значениями по умолчанию для своего типа данных
        // Для числовых примитивов -> 0 / 0.0
        // boolean -> false
        // для всех ссылочных (в том числе String) -> null


        cat.sayMau();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        System.out.println("Возраст: " + cat.age);

        System.out.println("\n=======================\n");

        Cat cat1 = new Cat("Max");
        //Будет создан новый объект класса Cat
        //Имя (строка) которая была передана в конструктор будет присвоено свойству name объекта класса

        System.out.println("Cat1.name: " + cat1.name);
        System.out.println("Cat1.color: " + cat1.color);
        System.out.println("Cat1.age: " + cat1.age);

        cat.whoAmI();
        cat1.whoAmI();

        System.out.println("\n===================\n");
        Cat cat2 = new Cat("Diamant", "red");

        cat2.whoAmI();

        System.out.println("\n===================\n");

        Cat Barsik = new Cat("Barsik", "Red", 2);
        System.out.println("Barsik name: " + Barsik.name);
        System.out.println("Barsik color: " + Barsik.color);
        System.out.println("Barsik age: " + Barsik.age);
        Barsik.whoAmI();

        Cat catClone = Barsik;
        catClone.whoAmI();
        Barsik.age = 100;
        System.out.println("Barsik = 100");
        Barsik.whoAmI();
        catClone.whoAmI();

        System.out.println("\n======================\n");

        catClone = new Cat("Pukin", "whit", 3);
        catClone.whoAmI();
        System.out.println(catClone);

        catClone = null; //ссылка не ссылается на никакой объект
        // если у переменной ,значение у которой null, попытаться вызвать метод,получить свойства -
        // программа завершится ошибкой NullPointerExeption.
        // У Null нельзя вызвать метод,получить или присвоить значение поля - NPE



    }
}
