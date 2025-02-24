package lesson15;

import java.util.Random;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        int x = 5;

        if (x == 5) System.out.println("if: x = 5");
        else if (x == 7) System.out.println("if-else: x = 7");
        else System.out.println("else: что-то другое");

        System.out.println("\n+++++++++++++++++++++++++\n");

        switch (x) {
            case 5:
                System.out.println("switch: x = 5");
                break;
            case 7:
                System.out.println("switch: x = 7");
                break;
            default:
                System.out.println("switch: что-то другое");
        }
        System.out.println("Строка за пределами");

        // Просим пользователя ввести число от 1 до 4. В зависимости от числа - выдать разное сообщение.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }

        System.out.println("\n+++++++++++++++++++++++++++++\n");

        // У ребёнка есть карманные деньги. Допустим сейчас у него 100.
        // Ребёнок получает в школе (от 1 до 5) за хорошие оценки ребёнок получает деньги,за плохие отбирают.
        //5 -> +20
        //4 -> +10
        //3 -> +0
        //2 -> -20
        //1 -> все деньги

        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5) + 1; //генерация числа от 1 до 5
         switch (note) {
             case 5:
                 money += 20;
                 break;
             case 4:
                 money += 10;
                 break;
             case 2:
                 money -= 20;
                 break;
             case 1:
                 money = 0;
         }
        System.out.println("Ребёнок получил оценку : " + note);
        System.out.println("У ребёнка сейчас денег : " + money);





       // if (note == 5) System.out.println(note + 20);
       // else if (note == 4 = note + 10) System.out.println(note);
        //else if (note == 3) System.out.println(note);
       // else if (note == 2) System.out.println(note - 20);
       // else System.out.println(note - note);

        //System.out.println("Ребёнок получил оценку: " + note);
       // System.out.println("У ребёнка сейчас денег: " + (100 - note));


        }









    }

