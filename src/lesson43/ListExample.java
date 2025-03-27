package lesson43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Конструкторы

        // Конструкторы ArrayList

        List<Integer> list = new ArrayList<>(); // Создаёт пустой список (с начальной ёмкостью 10 элементов)
        list = new ArrayList<>(50); // Создаёт список с указанной ёмкостью
        // Создаёт список,содержащий все э-ты указанной коллекции (копирование э-в из др. коллекции)
        list = new ArrayList<>(List.of(1,-10,5,0,25,-100)); // Принимает коллекцию

        // Конструкторы LinkedList
        list = new LinkedList<>(); //Создаёт пустой список (вн. реализация - двусвязный список)
        list = new LinkedList<>(List.of(1,-10,5,0,25,-100)); // Создаёт список,содержащий все э-ты указанной коллекции

        // Методы интерфейса List

        // boolean add (E e) - добавляет э-т в конце списка
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        // void add(int index, E element) - добавляет элемент на указанную позицию (перед индексом index)
        list.add(3,500);
        System.out.println(list);

        // E get(int index) - возвращает э-т по индексу
        int value = list.get(5);
        System.out.println(value);

        // E remove(int index) - удаляет элемент по индексу, возвращает старое значение
        System.out.println("list.remove(5)" + list.remove(5));
        System.out.println(list);

        // boolean remove(Object o) - удаление по значению (из интерфейса Collection) - принимант ссылочный тип данных
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println(list.remove("String"));
        System.out.println(list);

        // Поиск э-та по значению - возвращает индекс
        // int indexOf(Object obj) - первое вхождение
        // int lastIndexOf(Object obj) - последнее вхождение

        System.out.println("list.indexOf(4000): " + list.indexOf(4000)); // -1 значение не найдено
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));

        System.out.println("========================\n");

        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора
        list.sort((i1,i2)->Integer.compare(i2,i1));
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        list.sort(Integer::compareTo);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        // List<E> subList(int idxFrom, int idxTo) - возвращает список из эл-ов,
        // находящихся на позициях от idxFrom (включительно) до idxTo (не включительно)
        List<Integer> subList = list.subList(1,5);
        System.out.println("subList" + subList);


    }
}
