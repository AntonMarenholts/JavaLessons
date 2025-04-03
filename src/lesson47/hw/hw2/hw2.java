package lesson47.hw.hw2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class hw2 {

    /*
    Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
     */
    public static void main(String[] args) {


        List<String> strings = Arrays.asList("Яблоко", "Аристарх", "Лошадь", "Ворона", "машина");

        Optional<String> minLengthString = strings.stream()
                .min(Comparator.comparing(String::length));

        minLengthString.ifPresent(s -> System.out.println("Строка с минимальной длиной: " + s));
    }
    }

