package lesson14;

public class HomeWork_1 {
    public static void main(String[] args) {

        //Дан текст Programming is fun.
        //
        //Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и
        // выведите результат в виде булевой переменной.

        String text = "Programming is fun";
        boolean word = text.contains("fun");
        System.out.println(word);


    }
}
