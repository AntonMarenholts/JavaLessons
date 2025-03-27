package lesson43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов  для всех расширяющих его интерфейсов
        // (List, Queue, Set). Это позволяет нам единообразно обрабатывать различные типы коллекций.

        // Создаём коллекцию строк
        // Ссылка типа интерфейс -> набор доступных методов + ссылку на объект какого класса может хранить эта переменная.
        // Справа можем подставить объекты разных классов(получить разные реализации этого интерфейса)
        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true, если коллекция пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add(T t) - добавляет элемент в коллекции
        strings.add("Java");
        System.out.println("strings.add(\"Python\") :" + strings.add("Python"));

        // Переопределённый метод toString для красивого вывода элементов коллекции
        System.out.println(strings);

        // Статический метод .of() - метод в нескольких интерфейсах и классах JFC
        // Был введён в Java 9 (SDK 9 и выше)
        // Создаёт неизменяемую (нельзя удалить или добавить элемент) коллекцию из предоставленных элементов
        Collection<Integer> integers = List.of(1,2,3,4,5,6);
        System.out.println("integers: " + integers);
//        integers.add(7); // попытка модифицировать (изменить) неизменяемую коллекцию приведёт к ошибке (исключительная ситуация)

        // Методы addAll, removeAll, retainAll - это программная реализация операций над множествами в математике

        // addAll(Collection<? extends T> col) - добавить все элементы из указанной коллекции
        strings.addAll(List.of("JS","Go Laand", "Ruby", "Kotlin"));
        System.out.println(strings);

        System.out.println("========================\n");

        // removeAll(Collection<?> colB) - удаляет все элементы содержащиеся в коллекции colB из
        // коллекции на которой написан метод
        // colA.removeAll(colB) - удаляет из А все элементы, которые содержит В
        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0,1,2,3,4,5,3,2));

        colA.removeAll(List.of(3,2,1));
        System.out.println("colA.removeAll(List.of(3,2,1): " + colA);

        // Пересечение
        // retainAll(Collection<?> colB) - оставляетв в коллекции вызова только те элементы,которые содержатся в коллекции В
        // Удаляет из коллекции вызова э-ты, которые НЕ содержатся в коллекции В
        // colA.retainAll(colB) - оставляет в А только те э-ты,которые так же есть в В.

        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10,20,30,20,40,50,60));
        colB.addAll(List.of(20,30,40,100));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
//        colB.retainAll(colA);
        System.out.println("colA.retainAll(colB): " + colA);

        // boolean remove(Object obj) - удаляет э-т из коллекции. Вернёт true, если элемент был удалён.
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println(colA.remove(20));// удалит одно значение (даже если э-тов с таким значением несколько)
        // Если нужно удалить все вхождения
        colA.removeAll(List.of(20));
        System.out.println(colA);

        // clear() - удаляет вообще все элементы из коллекции (очищает)
        colA.clear();
        System.out.println(colA);

        // boolean containsAll(Collection<?> c): возвращает true, если коллекция содержит все элементы из указанной коллекции
        System.out.println("colA.containsAll(List.of(20,30)): " + colA.containsAll(List.of(20,30)));










    }
}
