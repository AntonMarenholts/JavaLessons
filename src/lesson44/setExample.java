package lesson44;

import java.util.*;

public class setExample {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println(str.hashCode());

        String str2 = "abc";
        System.out.println(str.equals(str2));
        System.out.println(str2.hashCode());

        /*
        Для корректной работы Hash-коллекций есть важное правило - контракт
        между hashCode() и equals()

        1. Если 2 объекта равны по equals, то их hashCode должны быть равны
        2. Если hashCode 2 объектов различны,то объекты точно не должныбыть равны по equals
        (обратно не всегда верно). Коллизия - разные объкты могут иметь одинаковые hashCode.
        3. Многократный вызов метода hashCode должен возвращать одинаковое значени при многократных
        вызовах на неизменённом объекте

         */
        // Конструкторы
        Set<Integer> set = new HashSet<>();// Создаёт пустой hashSet. Ёмкость 16 и коэфициентт заполнения 0.75
        set = new HashSet<>(20); // создаёт пустой ashSet с указанной ёмкостью
        // Принимает коллекцию - создаёт новый сет (множество),содержащий уникальные э-ты из указанной коллекции
        set = new HashSet<>(List.of(1,2,3,4,5,-10,5,7,6,3,0));

//        Integer v =100;
//        System.out.println(v.hashCode());

        System.out.println(set);

        List<Integer> startValues = List.of(15,1,2,3,4,5,4,2,8,6,15,7,0,16,32);

        // HashSet не поддерживает порядок добавления эл-ов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println(integers);

        // LinkedHashSet - сохраняет порядок добавления эл-ов
        Set<Integer> LinkedSet = new LinkedHashSet<>(startValues);
        System.out.println(LinkedSet);

        // Методы интерфейса Set

        // boolean add(E e) - добавление элемента
        System.out.println("integers.add(100): " + integers.add(100));// true - элемент был добавлен
        System.out.println(integers);
        System.out.println("integers.add(100): " + integers.add(100));// false - элемент НЕ добавлен,тка как уже есть такое значение
        System.out.println(integers);

        System.out.println("========================\n");

        // boolean remove(Object o) - удаляет элемент по значению
        System.out.println(integers.remove(100));
        System.out.println("remove: " + integers);

        // boolean contains(Object o) - проверяет присутствие элементов в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /*
        int size() - ол-во элементов в set
        boolean isEmpty() - возвращает true, если set не содержит элементов
        clear() - удаляет все элементы
         */

        System.out.println("====================\n");

        // iterator() - возвращает итератор  для элементов set
        // Наличие итератора позволяет последовательно перебирать все элементы циклом for-each

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value + ", ");
        }
        System.out.println();

        for (Integer val : integers){
            System.out.println(val + ", ");
        }
        System.out.println();

        // Убрать дубликаты

        // Написать метод,который принимает список и возвращает список,
        // состоящий только из уникальных элементов начального списка
        System.out.println("startValues = " + startValues);
        List<Integer> result = getUniqueList(startValues);
        System.out.println("getUniqueList: " + result);
        result.add(15);
        result.add(15);
        System.out.println(result);

        System.out.println("======================\n");

        // SortedSet - расширяет интерфейс Set
        // Элементы упорядочены в соответствии с их естественным порядком или компаратором,переданном при создании
        // (если э-ты реализуют Comparable)
        // Реализован в виде бинарного дерева

        // SortedSet Конструкторы
        // Пустой - Естественный порядок сортировки
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое,упорядоченное множество.Сортировка в соответствии с Comparator

        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);

        System.out.println(sortedSet);

        System.out.println("=================\n");

        // Принимает коллекцию. Создаёт Set из элементов коллекции. Сортировка в естественном порядке
        sortedSet = new TreeSet<>(startValues);
        System.out.println(sortedSet);

        // Конструкторы с компаратором, определяющим порядок хранения элементов

        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println(treeSet);

        treeSet = new TreeSet<>((i1,i2) -> Integer.compare(i2,i1));
        treeSet.addAll(startValues);

        treeSet = new TreeSet<>(startValues);
        System.out.println("treeSet: " + treeSet);

        // first() - возвращает самый первый (самый левый) элемент
        System.out.println(treeSet.first());

        // last() - возвращает самый последний (правый) элемент
        System.out.println(treeSet.last());

        // SortedSet<E> headSet(E element) - возвращает часть множества э-ты которого строго меньше чем э-т
        SortedSet<Integer> headSet = treeSet.headSet(6);
        System.out.println("headSeat" + headSet);

        // SortedSet<E> tailSet(E element) - элементы больше или равны element
        SortedSet<Integer> tailSet = treeSet.tailSet(6);
        System.out.println("tailSet: " + tailSet);

        // SortedSet<E> subSet(E fromElement, E toElement) - часть множества, от from (включительно) до oElement (не включительно)
        SortedSet<Integer> subSet = treeSet.subSet(6, 16);
        System.out.println("treeSet.subSet(6,16): " + subSet);

        // comparator() - возвращает компаратор, испольхуемый для упорядочивания э-тов в этом множестве
        // если используется естественный порядок,то вернётся - null

        homework("Тестовая 777   строка,со         cловами!");




    }
    private static void homework(String testStr){

        // Заменить все НЕ буквы на пустоту
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-Я0-9]"," ");
        System.out.println("newString: " + newString);

//        String str = String.join(" ", "Hello", "Java", "Test");
//        System.out.println("str: " + str);

        // Преобразование строки в массив слов
        // s - "пробельный символ" в кол-ве одна штука или больше
        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));

        // Arrays.asList(T[] array) - преобразует массив в список (List)
        List<String> list = Arrays.asList(words);
        System.out.println(list);




    }

    private static <T> List<T> getUniqueList(List<T> list){
        // Получить коллекцию,состоящую из уникальных элементов (убрать дубликаты)
        // P.S. Позаботиться о сохранении порядка элементов изначального списка

        Set<T> uniqueSet = new LinkedHashSet<>(list);
        // Преобразуем Set обратно в List
        return new ArrayList<>(uniqueSet);

    }






}
