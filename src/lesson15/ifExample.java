package lesson15;

import java.util.Random;

public class ifExample {
    public static void main(String[] args) {
        int age = 20;
        if (age > 11) System.out.println("Y > 11:");
        System.out.println("Продолжение программы");

        if (age > 12) {
            System.out.println("age > 12:");
            System.out.println("Вы уже не ребёнок");
        } else {
            System.out.println("Блок else");
            System.out.println("Сейчас age = " + age);
        }
        Random random = new Random();

        int score = 80;
        if (score >= 90) System.out.println("Супер!");
        else if (score >= 75) System.out.println("Хорошо!");
        else if (score >= 50) System.out.println("Удовлетворительно!");
        else System.out.println("Плохо!");

        System.out.println("\n+++++++++++++++++++++++++\n");


        //Нахождение минимального значения из нескольких чисел
        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51) - 20;
        int v3 = random.nextInt(51);

        int min = v1;
        if (v2 < min) min = v2;
        if (v3 < min) min = v3;
        System.out.println(min);


        }
    }

