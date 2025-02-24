package lesson15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Что это : жёлтый, большой, с рогами и зайцами?");
        System.out.println("Как думаешь?");
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();
        String answerClean = answer.trim().toLowerCase();

        System.out.println("trim: " + answer);

        switch (answerClean) {
            case "троллейбус":
            case "троллейбус!":
                System.out.println("Молодец, угадал!");
                break;
            case "сдаюсь":
            case "сдаюсь!":
                System.out.println("Быстро ты сдался. Правильный ответ - троллейбус!");
                break;
            default:
                System.out.println("Ответ не верный, попробуйте ещё раз.");
        }




    }
}
