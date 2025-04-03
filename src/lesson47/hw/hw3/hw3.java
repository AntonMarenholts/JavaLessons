package lesson47.hw.hw3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class hw3 {

    /*
    Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
и собрать результат в новый список
     */
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 12, 33, 4, 15, 26, 7, 8, 19,-10);

        List<Integer> evenNumbersDoubled = numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтруем чётные числа
                .map(n -> n * 2) // Умножаем каждое число на 2
                .toList(); // Собираем результат в новый список

        System.out.println("evenNumbersDoubled: " + evenNumbersDoubled);
    }
    }

