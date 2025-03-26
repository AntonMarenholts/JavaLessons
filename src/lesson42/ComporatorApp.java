package lesson42;

import java.util.Arrays;
import java.util.Comparator;

public class ComporatorApp {
    public static void main(String[] args) {
        int[] ints = new int[] {4,7,9,3,1,5,0};

        // apple < banana
        // Zebra < apple
        // Apple < apple


        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrary", 2025, 300);
        cars[5] = new Car("Ferrary", 2021, 250);

        printCars(cars);

        Arrays.sort(cars);

        //Интерфейс Comparable (сравнимый)
        // Интерфейс Comparator<T>

        printCars(cars);

        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars, speedComparator);
        printCars(cars);

        System.out.println("========================\n");
        Arrays.sort(cars, new CarModelCamparator());
        printCars(cars);

        System.out.println("=============================\n");

        // Анонимные классы - это класс для создания объкта налету без явного
        // объявления нового класса
        // Используется когда необходим одноразовый объект

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        printCars(cars);

        // Отсортировать машины по году выпуска в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            // 4, 1, 10
            // -> 1, 4, 10
            // -> 10, 4, 1
            // a vs b = a - b

            public int compare(Car car1, Car car2) {
                return car2.getYear() - car1.getYear();
            }
        });

        printCars(cars);

        // Сравнить машины по году выпуска в порядке возрастания,
        // а если год совпадает,тогда сравнить по модели в порядке убывания

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int yearCompare = car1.getYear() - car2.getYear();

                if (yearCompare != 0){
                    return yearCompare;
                }
                // годы машин равны (yearCompare = 0)
                // обратный порядок по модели
                return car2.getModel().compareTo(car1.getModel());

            }
        });
        printCars(cars);

        // Функциональный интерфейс - это интерфейс,который имеет РОВНО ОДИН абстрактный метод
        // (метод который нужно реализовать)
        // Интерфейс Comparator - функциональный интерфейс

        /*
        Лямбда-выражения это краткий способ реализаций анонимных функций (методов) в Java
        Компактный синтаксис для реализации методов функциональных интерфейсов

        (parameters) -> expression;
        или
        (parameters) -> {statements};

        Лямбда выраженя во многих случаях могут заменить анонимные классы и реализовывать
        на лету функциональные интерфейсы
         */

        // По году в обратном порядке с использованием лямбда
        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());

        // отсортировать машины по максимальной скорости в порядке убывания
        // если скорость совпадает,отсортировать по году естественный порядок
        Comparator<Car> carComparator = (car1, car2) -> {
            int speedCompare = Integer.compare(car1.getMaxSpeed(),car2.getMaxSpeed());

            if (speedCompare == 0){
                return car1.getYear() - car2.getYear();
            }
            return speedCompare;

        };
        Arrays.sort(cars, carComparator);
        printCars(cars);

        // Comparator - имеет набор статических и дефолтных методов, облегчающих написание
        // сложных / составных компараторов

        // comparing - позволяет сортировать объекты по ключу
        // Функция ключ - это способ вытащить из объкта то значение,по которому мы хотим
        // сравнивать 2 объекта
        /*
        car -> car.getYear

         */

        // Отсортировать машины по модели в естественном порядке
        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModel);
        printCars(cars);

        // Ссылка на метод - это сокращённая запись лямбда\
        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        printCars(cars);

        // Специальные версии метода для сравнения примитивов. Избежать авто-упаковки/распаковки
        // comparingInt, comparingLong, comparingDouble
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));

        /*
        Второй параметр метода comparing
        Comparator.naturalOrder() - определяет естественный порядок сортировки
        Comparator.reversOrder() - определяет обратный порядок сортировки
        Comparator.nullsFirst - значения null будут признаны как наименьшие
        Comparator.comparing(класс::другойМетод) - Это выражение создаёт компаратор,который сначала
        сравнивает объекты по результату метода метод.Если объекты равны (т.е. сравнение возвращает 0),
        то сравнение производится по другому ключу(который вернёт другойМетод)
        .reversed()
       */

        // Отсортировать по году выпуска по году выпуска в порядке убывания
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

//        cars[5] = new Car(null, 2021, 250);
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.naturalOrder())));

        printCars(cars);

        System.out.println("=========================\n");

        // Отсортировать по модели.Если модели равны,то отсортировать по убыванию года выпуска
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));

        printCars(cars);

        // Отсортировать машины по году выпуска,если год равен - отсортировать по модели в обратном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));

        // Отсортировать машины по году в обратном,если год равен отсортировать по макс скорости в прямом
        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed().thenComparing(car -> car.getMaxSpeed()).reversed());

        printCars(cars);

    }



    public static void printCars(Car[] cars){
        System.out.println("===============");
        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("====================\n");
    }
}
