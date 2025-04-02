package lesson46;

// Stream API. Функциональные интерфейсы Function,Predicate, Consumer являются частью Java Lambda Expression, введённых в Java8
   //Имплементации этих интерфейсов применяются,когда метод принимает интерфейс в качестве параметра

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {

    public static void main(String[] args) {

        // Consumer<T> - выполняет операцию над объектом типа Т при этом не возвращая никакого результата
        // void accept(T t)

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println("!!!");
            }
        };

        example = str -> System.out.println(str + "!!!");
        example.accept("Hello Word");
        example.accept("Java");

        // Составной интерфейс
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = str -> System.out.println("2. " + str + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("test");

        //Predicate<T> - проверка объекта на соответствие условия (тестирование)
        // boolean test(T t) - основной (абстрактный) метод

        /*
        and() - логическое И
        or() - логическое ИЛИ
        negate() - логическое отрицание
         */

        Predicate<String> example1 = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        Predicate<String> isShot = str -> str.length() < 3;
        boolean result = isShot.test("Java");
        System.out.println("isShot.test(\"Java\"): " + result);
        System.out.println("isShot.test(\"Js\"): " + isShot.test("Js"));

        List<Integer> list = new ArrayList<>(List.of(-1,3,-4,0,34,66,-100,13,99,224, 1));

        // список всех отрицательных чисел
        List<Integer> res = filterListByPredicate(list, i -> i < 0);
        System.out.println("filterListByPredicate(list, i -> i < 0): " + res);

        // список всех нечётных чисел
        res = filterListByPredicate(list, val -> val % 2 != 0);
        System.out.println("filterListByPredicate(list, val -> val % 2 != 0): " + res);

        // список всех чётных чисел больше 5
        res = filterListByPredicate(list, val -> val % 2 == 0 && val > 5);
        System.out.println("filterListByPredicate(list, val -> val % 2 == 0 && val > 5): " + res);

        System.out.println("======================\n");

        Predicate<String> isLongString = string -> string.length() > 4;
        Predicate<String> isContainsJava = str -> str.contains("Java");

        Predicate<String> combinePredicate = isLongString.and(isContainsJava);

        String word = "Java!";

        System.out.println("combinePredicate.test(word): " + combinePredicate.test(word));

        Predicate<String> combine2 = isContainsJava.negate();
        System.out.println(combine2.test(word));

        System.out.println("=======================function===============");

        // Function<T, R> - производит операцию над объектом Т, возвращает результат типа R
        // R apply(T t)

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        integerFunction = string -> string.length();

        int len = integerFunction.apply("Hello World");
        System.out.println("integerFunction.apply(\"Hello World\"): " + len);

        Function<String,String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("Hello World"));




    } //                     END

    // Метод должен возвращать список объектов,удовлетворяющих требованию / условию (прошедших проверку предикатом)
    public static List<Integer> filterListByPredicate(List<Integer> integers,Predicate<Integer> predicate){
        List<Integer> result = new ArrayList<>();

        for (Integer value : integers){
            if (predicate.test(value)){
                result.add(value);
            }
        }
        return result;
    }

}
