package lesson43.hw43.hw2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerfomanceComparison {

    /*
    Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
    Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

     Создайте 4 метода, принимающий реализацию интерфейса List.

     В первом методе - получение всех значений элементов списка по его индексу
     Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
    Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

    Сравните для каждого из списка время выполнения каждого метода.

    И сравните время последовательного выполнения всех методов для каждой реализации List-а.
     */

    private static final int LIST_SIZE = 5000;
    private static final int ADD_COUNT = 2000;
    private static final int REMOVE_BY_INDEX_COUNT = 1000;
    private static final int REMOVE_BY_VALUE_COUNT = 1000;
    private static final int MAX_VALUE = 1000;
    private static final int MAX_REMOVE_VALUE = 10000;

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            int randomNumber = random.nextInt(MAX_VALUE + 1);
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }

        System.out.println("Размер списков: " + LIST_SIZE);
        System.out.println("Количество элементов для добавления: " + ADD_COUNT);
        System.out.println("Количество элементов для удаления по индексу: " + REMOVE_BY_INDEX_COUNT);
        System.out.println("Количество элементов для удаления по значению: " + REMOVE_BY_VALUE_COUNT);
        System.out.println("Максимальное случайное значение: " + MAX_VALUE);
        System.out.println("Максимальное значение для удаления по значению: " + MAX_REMOVE_VALUE);
        System.out.println();

        // Тестирование для ArrayList
        System.out.println("--- Тестирование для ArrayList ---");
        long timeGetByIndexArrayList = measureGetByIndex(arrayList);
        System.out.println("Время получения по индексу: " + timeGetByIndexArrayList + " мс");

        long timeAddArrayList = measureAdd(arrayList);
        System.out.println("Время вставки: " + timeAddArrayList + " мс");

        long timeRemoveByIndexArrayList = measureRemoveByIndex(arrayList);
        System.out.println("Время удаления по индексу: " + timeRemoveByIndexArrayList + " мс");

        long timeRemoveByValueArrayList = measureRemoveByValue(arrayList);
        System.out.println("Время удаления по значению: " + timeRemoveByValueArrayList + " мс");

        long totalTimeArrayList = timeGetByIndexArrayList + timeAddArrayList + timeRemoveByIndexArrayList + timeRemoveByValueArrayList;
        System.out.println("Общее время выполнения всех методов: " + totalTimeArrayList + " мс");
        System.out.println();

        // Тестирование для LinkedList
        System.out.println("--- Тестирование для LinkedList ---");
        long timeGetByIndexLinkedList = measureGetByIndex(linkedList);
        System.out.println("Время получения по индексу: " + timeGetByIndexLinkedList + " мс");

        long timeAddLinkedList = measureAdd(linkedList);
        System.out.println("Время вставки: " + timeAddLinkedList + " мс");

        long timeRemoveByIndexLinkedList = measureRemoveByIndex(linkedList);
        System.out.println("Время удаления по индексу: " + timeRemoveByIndexLinkedList + " мс");

        long timeRemoveByValueLinkedList = measureRemoveByValue(linkedList);
        System.out.println("Время удаления по значению: " + timeRemoveByValueLinkedList + " мс");

        long totalTimeLinkedList = timeGetByIndexLinkedList + timeAddLinkedList + timeRemoveByIndexLinkedList + timeRemoveByValueLinkedList;
        System.out.println("Общее время выполнения всех методов: " + totalTimeLinkedList + " мс");
        System.out.println();

        // Сравнение времени выполнения для каждого метода
        System.out.println("--- Сравнение времени выполнения каждого метода ---");
        System.out.println("Получение по индексу:");
        System.out.println("  ArrayList: " + timeGetByIndexArrayList + " мс");
        System.out.println("  LinkedList: " + timeGetByIndexLinkedList + " мс");
        System.out.println();

        System.out.println("Вставка:");
        System.out.println("  ArrayList: " + timeAddArrayList + " мс");
        System.out.println("  LinkedList: " + timeAddLinkedList + " мс");
        System.out.println();

        System.out.println("Удаление по индексу:");
        System.out.println("  ArrayList: " + timeRemoveByIndexArrayList + " мс");
        System.out.println("  LinkedList: " + timeRemoveByIndexLinkedList + " мс");
        System.out.println();

        System.out.println("Удаление по значению:");
        System.out.println("  ArrayList: " + timeRemoveByValueArrayList + " мс");
        System.out.println("  LinkedList: " + timeRemoveByValueLinkedList + " мс");
        System.out.println();

        // Сравнение общего времени выполнения
        System.out.println("--- Сравнение общего времени выполнения ---");
        System.out.println("Общее время (ArrayList): " + totalTimeArrayList + " мс");
        System.out.println("Общее время (LinkedList): " + totalTimeLinkedList + " мс");
    }

    private static long measureGetByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureAdd(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ADD_COUNT; i++) {
            int randomIndex = random.nextInt(list.size() + 1);
            list.add(randomIndex, random.nextInt(MAX_VALUE + 1));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureRemoveByIndex(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < REMOVE_BY_INDEX_COUNT; i++) {
            if (!list.isEmpty()) {
                int randomIndex = random.nextInt(list.size());
                list.remove(randomIndex);
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long measureRemoveByValue(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < REMOVE_BY_VALUE_COUNT; i++) {
            if (!list.isEmpty()) {
                int randomValueToRemove = random.nextInt(MAX_REMOVE_VALUE + 1);
                list.remove((Integer) randomValueToRemove); // Удаляем первое вхождение
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
