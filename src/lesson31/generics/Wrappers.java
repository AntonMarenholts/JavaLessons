package lesson31.generics;

public class Wrappers {
    //Классы обёртки используются для представления примимтивных типов как объектов (как ссылочных)

    /*
    Byte - обёртка byte
    Short - обёртка short
    Integer - обёртка int
    Long - обёртка long
    Float - обёртка float
    Double - обёртка double
    Character - обёртка char
    Boolean - обёртка boolean
     */
    public static void main(String[] args) {

    Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        // Поддержка null
        // int x = null; примитивы не поддерживали null

        maxValue = null;

        // Приведение типов. Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // Автоупаковка приметива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitivInt = wrapperInt; // Автораспаковка. Из типа Integer автоматич. преобразовано в примитив типа int
        System.out.println(primitivInt);

        System.out.println("\n====================\n");

        // Сравнение объектов по значению -> следует использовать метод equals
        // -128...127 - Кеширование

        Integer a = 127; // создан объект с адрессом в памяти @2aa2
        Integer b = 127; // объект с таким значением уже есть.Новый не создаётся - выдаётся ссылка на существующий

        // Сравниваем значения,записанные в переменных(т.е. ссылки, т.е. адреса объектов в памяти)
        System.out.println("127 == 127: " + (a == b)); // true
        System.out.println(a.equals(b));// true

        Integer c = 128;// Создан объект с адрессом в памяти @3bbbb3
        Integer d = 128;// Создан объект с адресом в памяти @4ccc4. Не проверяется на наличие объекта с таким значением
        System.out.println("128 == 128: " +(c == d)); // false
        System.out.println(c.equals(d));// true

        System.out.println("\n========================");

        //Общие(или схожие) методы, которыми обладают классы-обёртки:




    }

}
