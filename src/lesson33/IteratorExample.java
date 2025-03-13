package lesson33;
/*

Есть два интерфецса Iterable и Iterator
  1. Iterable<T> - означает,что объекты этого класса можно последовательно перебирать
    Один абстрактный метод: Iterator<T> iterator() - возвращает итератор для этого набора элементов (коллекции)
  2. Iterator<T> - собственно итератор, который позволяет обходить коллекцию.
    - boolean hasNext() - есть ли следующий элемент
    - T next() - возвращает следующий элемент
    - void remove() - удаляет последний возвращённый элемент (не обязателен для переопределения)

 */

import lesson31.lists.MyArrayList;
import lesson31.lists.MyList;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
        }

        // Цикл for-each

        System.out.println("\n==================");

        for (String strCurrent : list){
            System.out.println(strCurrent);
        }


        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);

        // Вывести в консоль все числа, которые есть в списке умнож на 2

        for (Integer value : integers){
            System.out.println(value * 2);
        }

        // Вывести все элементы массива циклом for-each
        int[] array = {10,20,30,40,50};

        for (int element : array){
            System.out.println(element);
        }


    }
}
