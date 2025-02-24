package lesson13;

import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {

        //Замените в результирующей строке слово "powerful" на "super".
        //Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        //Выведите на экран значение этой переменной.

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        // объеденяем строки
        String string = String.format("%s %s %s %s %s",str1, str2, str3, str4, str5);
        System.out.println("Исходная строка: " + string);

        //заменяем слово "powerful" на "super" с помощью replace()
        String newString = string.replace("powerful", "super");
        //выводим изменённую строку на экран
        System.out.println("Изменнённая строка: " +newString);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для поиска: ");
        String word = scanner.nextLine();

        //проверяем,содержит ли строка введённое слово с помощью contains()
        boolean containsWord = string.contains(word);
        System.out.println("Содержит ли строка ПОДСТРОКУ '" + word + "'? " + containsWord);
    }
}
