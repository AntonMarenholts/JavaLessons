package lesson15;

import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {
        //Напишите программу с использованием оператора switch:
        //
        //Программа просит пользователя ввести число от 1 до 7.
        // Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 (дни недели понедельник-воскресенье): ");

        int week = scanner.nextInt();

        switch (week) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Сегодня выходной");
                break;
            default:
                System.out.println("Вы ввели не правильное число!");

        }
    }
}
