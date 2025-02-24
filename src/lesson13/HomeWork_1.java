package lesson13;

import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
        //Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
        //Используя Scanner, сохраните имя в переменную типа String.
        //Выведите на экран количество символов в имени пользователя.
        //Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
        //Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите своё имя:");
        String name = scanner.nextLine(); // получаем имя пользователя
        System.out.println("Name:" + name);

        int length = name.length(); //используем name для вычисления длинны
        System.out.println("length: " + length);

        char symbol1 = name.charAt(0);//используем name для получения первого символа
        System.out.println("First symbol: " + symbol1);

        char symbol2 = name.charAt(name.length() - 1); // Используем name для получения последнего символа

        System.out.println("Last symbol: " + symbol2);






    }
}
