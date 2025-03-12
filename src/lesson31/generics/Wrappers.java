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

        // .valueOf() - преобразует явным образом приметив или строку в объект типа обёртки
        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        double dbl = Double.valueOf(123.23);
        System.out.println("double: " + dbl);

        boolean b1 = Boolean.valueOf("true");


        // parseXXX() - преобразует строку в соответствующий примитив
        double dblP = Double.parseDouble("456");
        Double dblD = Double.valueOf(123.3);
        System.out.println(dblP + " | " + dblD);

        // toString - переопределяет метод , который возвращает строковое представление числа
        // equals - сравнивает два объекта по значению

        Integer i1 = 127;
        Integer i2 = 234;
        System.out.println(i1 > i2);

        // compareTo - сравнивает текущий объект с другим объектом. Кто больше?
        // тип возвращаемого значения int
        System.out.println("i1.compareTo(i2): " + i1.compareTo(i2));
        System.out.println("i2.compareTo(i1): " + i2.compareTo(i1));
        System.out.println("i2.compareTo(i2): " + i2.compareTo(i2));
        /*
        i1 > i2 -> положительное
        i1 < i2 -> отрицательное
        i1 = i2 -> 0
         */

        System.out.println("\n=======================");

        //xxxValue() - возвращает значения объекта как примитивный тип

        Double d2 = 125.67; // автоупаковка
        d2 = Double.valueOf(125.67); // явная/принудительная упаковка
        double dPrimitiv = d2; // распаковка
        dPrimitiv = d2.doubleValue(); // явная/принудительная распаковка

        System.out.println("\n====================");

        /*
        Абстрактный класс Number. Все числа-обёртки наследуются от класса Number
        Byte,Short,Integer,Long,Float,Double
         */

        /*
        byteValue()
        shortValue()
        integerValue()
        longValue()
        floatValue()
        doubleValue()
         */

        //
        Integer integer = 31844;
        double dVal = integer.doubleValue();
        System.out.println(dVal);

        System.out.println(integer.floatValue());
        System.out.println(integer.longValue());

        Double dWrapper = 245.54;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);




    }

}
