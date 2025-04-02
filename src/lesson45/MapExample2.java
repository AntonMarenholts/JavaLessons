package lesson45;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(7, "red");

        System.out.println(map);

        // Collection<V> values() - возвращает коллекцию всех значений карты
        Collection<String> values = map.values();
        System.out.println("map.values(): " + map.values());

        // Set<K> keySet() - возвращает сет состоящий из всех ключей карты
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);

        // Могу перебрать ключи в цикле и получить все значения
        for (Integer key : keys){
            System.out.print(map.get(key) + "; ");
        }
        System.out.println();

        /*
        ФОКУС. Живая связь
        Метод keySet и values возвращают представление / проекция (view) соответствующих ключей и значений карты
        Эта проекция поддерживается самой картой,что означает,что они напрямую связаны с внутренними данными мапов
        Поэтому любые изменения, внесённые в эти представления,отражаются на исходной карте.
        Причём эта связь двусторонняя.
         */

        // Удаляю ключ из сета ключей
        keys.remove(17);
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);
        System.out.println("values: " + values);

        System.out.println("===================\n");

        values.remove("green");
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);

        System.out.println("=====================\n");

        map.remove(16);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("===================\n");

        // Удалить все пары с такими значениями
        values.removeAll(List.of("red"));
        System.out.println(map);
        System.out.println(keys);
        System.out.println(values);

        System.out.println("===================\n");

        // Если мы хотим разорвать связь - нужно копировать элементы в другую коллекцию
        Set<Integer> keysCopy = new HashSet<>( map.keySet());

        keysCopy.remove(0);
        System.out.println("keysCopy: " + keysCopy);
        System.out.println("map: " + map);


        System.out.println("=============Map.Entry===============\n");

        // Set<Map.Entry<Integer, String>> entrySet() - возвращает set вхождений всех пар ключ-значение

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.print("entry: " + entry + " -> ");
            System.out.print("entry.getKey(): " + entry.getKey() + " | ");
            System.out.println("entry.getValue(): " + entry.getValue() + "\n");
        }
        // Тоже живая связь
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            if (entry.getKey().equals(100)){
                entry.setValue("Java!");
            }
        }

        System.out.println("map: " + map);

        // put vs replace
        // foreach - перебора всех пар ключ-значение с возможностью применить к ним какую-то функцию.

        System.out.println("=================put vs replace================\n");

        System.out.println(map.put(11, "orange"));// если такого ключа нет,добавляется новая пара ключ-значение
        System.out.println(map.put(11, "green"));// если ключ уже есть,значение будет переписано

        // replace(K key, V value) - если такого ключа нет,новая пара не создаётся
        System.out.println(map.replace(200, "red")); // ключа нет,но новая пара не добавляется
        System.out.println(map.replace(15, "red")); // ключ есть,значенте будет переписано


        System.out.println(map);

        System.out.println("=====================foreach==================\n");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            // могу что-то делать с этими значениями
            System.out.println(key + ": " + value);
        }

        // foreach - перебор всех пар ключ-значение с возможностью применить к ним какую-то функцию
        map.forEach((k,v) -> System.out.println(k + "= " + v));

        System.out.println("=================Многострочное действие=========================");
        map.forEach((key,val)->{
            System.out.println("Iteration: ");
            System.out.println("key: " + key + "| Value: " + val);

        });





    }
}
