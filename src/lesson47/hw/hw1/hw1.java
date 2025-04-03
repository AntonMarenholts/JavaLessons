package lesson47.hw.hw1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class hw1 {
    public static void main(String[] args) {

        /*
        Task 1
Из списка целых чисел выделите те значения,
которые больше 10; отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
         */
        List<Integer> integers = Arrays.asList(3,8,88,-22,34,54,2,9,0,24);

        List<Integer> sortedNummer = integers.stream()
                .filter(n -> n > 10)
                .sorted(Comparator.comparingInt(n -> n % 10))
                .toList();

        System.out.println("sortedNummer: " + sortedNummer);




    }
}
