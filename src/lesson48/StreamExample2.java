package lesson48;

/*
Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле

Основная идея - преобразование последовательности элементов через набор операций.

Stream (поток) - поток данных (последовательность элементов).
Поток даёт возможность поочерёдного получения э-тов для обработки.
Стримы могут быть созданы из различных источников (коллекции,массивы,файлы,консоль и т.п.)

Pipeline - последовательность операций,выполняемых на потоке данных.

1.Промежуточные операции/методы (Intermediate operations) - это операции,которые преобразуют поток в другой поток (возвращают поток)
  Их может быть много (больше чем одна)

2.Терминальные операции/методы - это операции,которые запускают обработку потока и закрывают его.
  Послевыполнения терминальной операции роток перестаёт быть доступным для дальнейшей обработки.
  Может быть ТОЛЬКО ОДИН.

  Ленивые вычисления
  Стримы не выполняют промежуточные операции,пока на потоке не будет вызван терминальный метод

 */

import lesson47.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

    /*
   1. Промежуточные методы (ВСЕ возвращают поток):

   Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те э-ты,для которых предикат вернёт true
   Т.е. оставляет э-ты,удовлетворяющие условию (отбрасывает э-ты НЕ удовл. условию)

   sorted() - сортирует поток в естественном порядке

   sorted(Comparator<T> comparator) - сортирует элементы потока с использованием компаратора.

   Stream<R> map(Function<T, R> action) -преобразует э-ты потока с использованием заданной функции,
   в том числе в другой тип данных

   Stream<T> peek(Consumer<T> action) - выполняет действие для каждого э-та потока.
   Действие как правило не изменяющее э-т.

   distinct() - Удаляет дубликаты из потока. Сравнивание (определение равенства) методом equals

   Limit(long maxSize) - ограничивает кол-во элементов потока.В потоке может быть не больше maxSize элементов

   skip() — используется для пропуска первых n элементов потока и возвращает новый поток,
   содержащий оставшиеся элементы.

   Stream<T> mapToObj(Function() mapper) - преобразование примитивного типа данных
   в ссылочный тип данных

   boxed() - преобразует потока примитивов (IntStream и т.п) в поток соответствующих обёрток

   mapToInt - преобразует поток Stream<Integer> в поток примитивов IntStream


    -----------

    2. Терминальные методы:

    R collect(Collector<T, A, R> collector) - преобразует э-ты потока в разные виды коллекций или другие структуры данных.

    void foreach(Consumer<T> action) - выполняет заданное действие для каждого э-та потока

    Optional<T> max(Comparator<T> comparator) - возвращает элемент с макс. значениями (самое первое) по мнению компаратора
    Optional<T> min(Comparator<T> comparator) - возвращает элемент с мин. значениями (самое левое) по мнению компаратора

    long count() - возвращает количество элементов в потоке данных

    Optional<T> findFirst - получить первый элемент потока. Нужно сортировать.
    Optional<T> findAny - получить случайный элемент потока.





     */



    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
        task16();


    }

    private static void task16() {
        int[] ints = {1,2,3,4,5,6,7,8,9,};

        // Пеобразовать массив примитивов в список (коллекцию), используя Stream

        // Stream<int> - не бывает. IntStream, DoubleStream...... бывают потоки примитивов

        List<Integer> integers =  Arrays.stream(ints)
//                .mapToObj(i -> Integer.valueOf(i))
                // работает автоупаковка
//                .mapToObj(i -> i)
                .boxed()
                .toList();
        System.out.println("integers: " + integers);

        // Получить из коллекции Integer массив примитивов
        int[] intArray = integers.stream()
                .mapToInt(i -> i)
                // хочет поток примитивов
                .toArray();

        System.out.println("intArray: " + Arrays.toString(intArray));

    }

    private static void task15() {
        List<Integer> integers = List.of(5,4,13,56,24,-10,-5,0,45,-25,200);
        // Получить первый(самый левый) элемент потока.

        // Альтернативный способ нахождения минимума
        Optional<Integer> first = integers.stream()
                .sorted()
                .findFirst();// Получить первый элемент потока
//                .findFirst();// Получить случайный элемент потока

        System.out.println("first: " + first);



    }

    private static void task14() {

        List<Integer> integers = List.of(5,4,13,56,24,-10,-5,0,45,-25,200);

        // Хочу получить список,состоящий из 3-х самых маленьких чисел списка
        List<Integer> smalLest = integers.stream()
                .sorted()
                .limit(3)
                .toList();
        System.out.println("smalLest: " + smalLest);

        // Получить список чисел,отбросив два самых маленьких

        List<Integer> list = integers.stream()
                .sorted()
                .skip(2)
                .toList();

        System.out.println("list: " + list);



    }

    private static void task13(){

        // Посчитать кол-во чётных чисел в списке используя Stream
        List<Integer> integers = List.of(5,4,13,56,24,-10,-5,0,45,-25,200);

        long count = integers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(count);

    }

    private static void task12(){

        List<Cat> cats = getListCats();

        // Найти самое длинное имя кота из списка котов

        /*
        Стрим котов преобразовать в стрим имён и при помощи метода max преобразовать по длинне
         */

        Optional<String> longestName = cats.stream()
                .filter(Objects::nonNull)
                .map(Cat::getName)
                .max(Comparator.comparing(String::length));

        if (longestName.isPresent()){
            System.out.println(longestName.get());
        } else {
            System.out.println("отов с таким именем не найдено");
        }


    }

    private static void task11(){
         List<Integer> integers = List.of(5,4,13,56,24,-10,-5,0,45,-25,200);

         // Найти максимальное число из списка
        Optional<Integer> max = integers.stream()
                .max(Comparator.naturalOrder());

        System.out.println("max: " + max);
        System.out.println("max: " + max.orElse(null));

        // Найти самое маленько число в потоке,которое больше 100

        Optional<Integer> minValue = integers.stream()
                .filter(n->n > 100)
                .min(Integer::compareTo);

        System.out.println("minValue: " + minValue);
        System.out.println("minValue: " + minValue.orElse(null));

    }

    private static void task10(){
        // Удалить дубликаты (повторяющиеся значения) из списка
        List<Integer> integers = Arrays.asList(10,20,30,20,30,50,0);

        List<Integer> unique = integers.stream()
                .distinct()
                .toList();
        System.out.println(unique);

        System.out.println("================================");

        lesson47.Cat cat1 = new lesson47.Cat("Bear",5,"braun");
        lesson47.Cat cat2 = new lesson47.Cat("Python",7,"green");
        lesson47.Cat cat3 = new lesson47.Cat("Tiger",3,"yellow");
        lesson47.Cat cat4 = new lesson47.Cat("Panda",4,"black");
        lesson47.Cat cat5 = new lesson47.Cat("Panda",4,"black");

        List<lesson47.Cat> cats = Arrays.asList(cat1,cat2,cat3,cat4,cat5,cat1);
        cats.forEach(System.out::println);

        System.out.println("=====================\n");

        cats.stream()
                .distinct()
                .forEach(System.out::println);

    }

    private static void task9(){
        // создание Stream из Мар

        Map<String,Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из э-тов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("map: " + map);
    }

    private static void task8(){

        lesson47.Cat cat1 = new lesson47.Cat("Bear",5,"braun");
        lesson47.Cat cat2 = new lesson47.Cat("Python",7,"green");
        lesson47.Cat cat3 = new lesson47.Cat("Tiger",3,"yellow");
        lesson47.Cat cat4 = new lesson47.Cat("Panda",4,"black");

        lesson47.Cat[] cats = {cat1,cat2,null, cat3,new lesson47.Cat(null,10,"red"), cat4};

        // Получить список кошек,имя которых длиннее 4-х символов

        // Arrays.stream(cats) - создаёт поток из э-тов массива

        List<lesson47.Cat> longCats = Arrays.stream(cats)
//                .filter(cat -> cat != null) // оставить в потоке только не null
                .filter(cat -> Objects.nonNull(cat)) // оставить в потоко только НЕ null
                .filter(cat -> Objects.nonNull(cat.getName()))// проверка какого-то поля на null
                .filter(cat -> cat.getName().length() > 4)
                .toList();

                /*
                Objects.nonNull(null) вернёт true,если параметр НЕ null
                Objects.nisNull(null) вернёт true,если параметр null
                 */

        System.out.println(longCats);

    }

    private static void task7(){

        List<lesson47.Cat> cats = getListCats();

        // Хочу вывести на экран имена котов, чей вес меньше 5
        // Хочу вывести на экран котов,оставшихся в потоке после фильтрации

        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(cat -> cat.getName());

        /*
        peek - промежуточный метод.Используется для отладки.Не закрывает поток.
        foreach - терминальный метод. Для выполнения действия с каждым э-том потока.Закрывает поток.
         */

        catStream.forEach(name -> System.out.println(name));



    }

    private static void task6(){

        // Получить список имён кошек,у которых имена короче 5 символов

        List<lesson47.Cat> cats = getListCats();
        /*
        Классический - методы фильтрации должны выполняться в потоке как можно раньше.
        Эффективность
         */
        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(lesson47.Cat::getName)
                .toList();
        System.out.println(names1);

        /*
        Читаемость и понимание кода
         */

        System.out.println("=========================\n");
        List<String> names2 = cats.stream()
                .map(lesson47.Cat::getName)
                .filter(name -> name.length() < 5)
                .toList();
        System.out.println(names2);




    }

    private static void task5(){
        List<lesson47.Cat> cats = getListCats();
        /*
        Получить список имён кошек,чей вес больше 4

        Создать поток кошек
        Оставить кошек,чей вес больше 4
        Изменить тип потока - Cat -> String (name)
        Собрать это в список
         */

        List<String> names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(cat -> cat.getName())
//                .map(Cat::getName)
                .toList();
        System.out.println("names: " + names);
    }

    private static void task4(){
        List<lesson47.Cat> cats =getListCats();

        // Получить список имён всех кошек
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(lesson47.Cat::getName)
                .toList();
        System.out.println("catNames: " + catNames);

        // Изначальная коллекция (источник данных для потока) НЕ изменяется
        System.out.println(cats);
    }

    private static void task3(){
        List<lesson47.Cat> cats = getListCats();

        // Оставить котов с именем длиннее 4-х символов
        Stream<lesson47.Cat> catStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // пока не запущен терминальный метод - промежуточные операции не выполняются

        List<lesson47.Cat> lengCat = catStream.toList();
        System.out.println("lengCat: " + lengCat);

    }

    private static List<lesson47.Cat> getListCats(){
        return List.of(
                new lesson47.Cat("Bear",5,"braun"),
                new lesson47.Cat("Python",7,"green"),
                new lesson47.Cat("Tiger",3,"yellow"),
                new lesson47.Cat("Panda",4,"black")
        );
    }

    private static void task2(){
        List<lesson47.Cat> cats = getListCats();

        // список кошек с весом больше 4
        Stream<lesson47.Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод
//        List<Cat> fatCats = catStream.collect(Collectors.toList());
        List<lesson47.Cat> fatCats = catStream.toList();
        System.out.println("fatCats: " + fatCats);

        // Повторно использовать "закрытый" поток нельзя
        // Закрытый-поток, на котором уже был вызван терминальный метод
        List<Cat> catList2 = catStream.sorted().toList();// будет ошибка (исключение)





    }

    private static void task1(){
        List<Integer> integers = List.of(-1,12,0,5,1,-15,24,99);

        // Получить список,содержащий все положительные числа из исходного списка
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();

        for (Integer num : integers){
            if (num > 0){
                result.add(num);
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекций

        List<Integer> integerList = integers.stream() // создание потоков из э-тов коллекции list
                .filter(e-> e > 0) // фильтрация э-тов потока
                .sorted()// сортировка э-тов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию list

        System.out.println("integerList: " + integerList);
    }



}
