package lesson43.hw43.hw1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListIntersection {
    /*
    Напишите метод, который принимает на вход две реализации интерфейса List.
    Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
     */


    public static <T> List<T> findIntersection(ArrayList<T> arrayList, LinkedList<T> linkedList) {
        if (arrayList == null || linkedList == null) {
            return new ArrayList<>();
        }

        List<T> intersection = new ArrayList<>();



        for (T elementArrayList : arrayList) {
            if (containsElement(linkedList, elementArrayList)) {
                if (!intersection.contains(elementArrayList)) {
                    intersection.add(elementArrayList);
                }
            }
        }

        return intersection;
    }


    private static <T> boolean containsElement(List<T> list, T element) {
        for (T item : list) {
            if (item != null && item.equals(element)) {
                return true;
            } else if (item == null && element == null) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Пример использования:
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);

        LinkedList<Integer> listB = new LinkedList<>();
        listB.add(3);
        listB.add(4);
        listB.add(5);
        listB.add(6);

        List<Integer> intersectionResult = findIntersection(listA, listB);
        System.out.println("Пересечение " + listA + " и " + listB + ": " + intersectionResult); // Output: [3, 4]

        ArrayList<String> listC = new ArrayList<>();
        listC.add("яблоко");
        listC.add("банан");
        listC.add("вишня");

        LinkedList<String> listD = new LinkedList<>();
        listD.add("банан");
        listD.add("финик");
        listD.add("вишня");

        List<String> intersectionResult2 = findIntersection(listC, listD);
        System.out.println("Пересечение " + listC + " и " + listD + ": " + intersectionResult2); // Output: [банан, вишня]

        ArrayList<Integer> listE = new ArrayList<>();
        LinkedList<Integer> listF = new LinkedList<>();
        List<Integer> intersectionResult3 = findIntersection(listE, listF);
        System.out.println("Пересечение " + listE + " и " + listF + ": " + intersectionResult3); // Output: []

        ArrayList<Integer> listG = new ArrayList<>();
        listG.add(1);
        LinkedList<Integer> listH = null;
        List<Integer> intersectionResult4 = findIntersection(listG, listH);
        System.out.println("Пересечение " + listG + " и null: " + intersectionResult4); // Output: []
    }
}
