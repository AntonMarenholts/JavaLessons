package lesson26;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + "is" + " " + "the" + " " + "best";

        // StringBuilder - это класс, который используется для создания и манипулирования
        // изменяемыми строками.

        // Перегруженный конструктор.Может быть пустым,может принимать String
        StringBuilder sb = new StringBuilder(); // пустой конструктор
        sb = new StringBuilder("Hello");

        //Метод для добавления символов в конце строки (приклеивание справа). Аналог конкатенации.
        sb.append(""); // "Hello" + " ";

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        // Метод,который позволяет вставить символы в указанную позицию
        sb = new StringBuilder("Hello World"); // Hello beautiful World
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());

        // Заменить подстроку (определяется индексами на указанное значение)
        sb = new StringBuilder("Hello World"); //"Hello Java!"
        sb.replace( 6, 11, "Java"); // замени мне всё что было с 6 по 11 индекс на нужное мне значение.
        System.out.println(sb.toString());

        // Удалить подстроку в диапазоне от start до end (не вкл)
        sb = new StringBuilder("Hello World");
        sb.delete(5,11);
        System.out.println(sb.toString());

        // Надо знать есть ли в sb какая-то подстрока
        sb = new StringBuilder("Hello World");
        int index = sb.indexOf("W");
        System.out.println(index);
        index = sb.lastIndexOf("Java");
        System.out.println(index);

        // Реверс - разворачивает последовательность символов
        sb = new StringBuilder("Hello World");
        sb.reverse();
        System.out.println(sb.toString());

        // Получить символ по индексу
        sb = new StringBuilder("Hello World");
        char ch = sb.charAt(4);
        System.out.println(ch);

        // Количество символов в sb (длинна)
        sb = new StringBuilder("Hello World");
        System.out.println(sb.length());

        // Установить новую длинну (обрезать или расширить sb)
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку,она будет заполнена char  с кодом 0
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println((int) ch1);

        // Обрезать длинну
        sb.setLength(3);
        System.out.println(sb.toString());

        /*
        Написать метод,который запрашивает у пользователя строку,состоящую из нескольких слов и
        возвращает аббревеатуру этой фразы (первые буквы каждого слова, записанное в верхнем регистре)
        Научно Исследовательский Институт - НИИ

         */
        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" "); // результат - массив строк
        System.out.println(Arrays.toString(words));

        String str1 = "jkhdsd as;dhif";
        //Получить массив символов из которых состоит строка
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));



    }
}
