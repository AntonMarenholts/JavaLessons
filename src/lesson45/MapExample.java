package lesson45;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // Map<K, V>

        // Коллизия - иногда разные ключи могут привести к одному номеру ячейки (одинаковый хеш-код и/или ячейки)


        Map<Integer, String> pldTable = new Hashtable<>(); // Устаревшая и медленная,НЕ рекомендуется

        Map<String,String> phoneBook = new HashMap<>();

        //Добавить пару ключ+значение
        // V put(K key, V value) -> возвращает старое значение,соответствующее раннее этому ключу
        // Если такого ключа ещё не было вернёт - null

        System.out.println(phoneBook.put("Hanna", "+49-111111"));
        phoneBook.put("Max", "+49-22222");
        phoneBook.put("John", "+49-33333");

        System.out.println("phoneBook: " + phoneBook);

        phoneBook.put(null, "+49-00000");
        String oldValue = phoneBook.put("John ", "+49-44444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook);

        Map<String,String> book2 = new HashMap<>();
        book2.put("Sebastian","+49-55555");
        book2.put("Michael","+49-6666");

        // putAll - принимает карту (Map) и копирует все пары ключ-значение из этой карты
        phoneBook.putAll(book2);
        System.out.println("phoneBook: " + phoneBook);

        // boolean contains(Object key) - вернёт true,если карта содержит такой ключ
        // boolean contains(Object value) - вернёт true,если карта содержит хотя бы одно такое значение
        System.out.println("phoneBook.containsKey(\"Michael\")" + phoneBook.containsKey("Michael"));
        System.out.println("phoneBook.containsKey(\"123\")" + phoneBook.containsKey("123"));

        System.out.println("phoneBook.containsValue(\"+49-44444\")" + phoneBook.containsValue("+49-44444"));



        System.out.println("========================\n");

        // Взятие значения по ключу
        // V get (K key) - возвращает значение по ключу. Если значения нет,вернёт null
        String value = phoneBook.get("Hanna");
        System.out.println("phoneBook.get(\"Hanna\"): " + value);

        System.out.println(phoneBook.get("KEY")); // null

        // getOrDefault(Object key, V defaultValue)
        // Возвращает значение по ключу. Если ключа нет - вернёт значение по умолчанию (второй параметр метода)
        String val2 = phoneBook.getOrDefault("Hanna", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"Hanna\"): " + val2);
        val2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"KEY\"): " + val2);

        System.out.println("=======================\n");

        // Конструкторы
        Map<Integer,String> construct = new HashMap<>(); // Создаётся пустой список пар ключ-значение.
                                         //16 корзин. К-т заполнения 0.75
        construct = new HashMap<>(30); // Создастся пустой словарь. 32 корзины. К-т заполнения 0.75
        construct = new HashMap<>(32, 0.90f); // Создастся пустой словарь. 32 корзины. К-т заполнения 0.90
        Map<Integer,String> otherMap = new HashMap<>();
        otherMap.put(1,"a");

        construct = new HashMap<>(otherMap);
        System.out.println(construct);

        // V remove(Object key) - удаляет пару ключ-значение. Возвращает старое значение или null
        System.out.println("phoneBook: " + phoneBook);
        System.out.println(phoneBook.remove("Sebastian"));
        System.out.println("phoneBook: " + phoneBook);
        System.out.println(phoneBook.remove("Sebastian"));

        // boolean remove(Object key, Object value) - удаляет пару ключ-значение,только если и ключ и значение соответствуют
        // текущим в мапе. Вернёт true
        System.out.println("phoneBook.remove(\"John\", \"0000\"): " + phoneBook.remove("John", "0000"));
        System.out.println("phoneBook.remove(\"John\", \"+49-33333\"): " + phoneBook.remove("John", "+49-33333"));
        System.out.println("phoneBook: " + phoneBook);

        // void clear() - очищает карту
        // int size() - озвращает кол-во элементов (пар ключ-значениие)
        System.out.println("phoneBook.size(): " + phoneBook.size());
        // boolean isEmpty() - вернёт true, если словарь пустой






    }
}
