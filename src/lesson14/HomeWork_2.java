package lesson14;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_2 {
    public static void main(String[] args) {

        //Создайте две переменные типа int.
        //В первую переменную запишите случайное значение от 0 до 50.
        //Во вторую переменную случайное значение от 0 до 100.
        //(опционально) Во вторую переменную случайное значение от -20 до 30.
        //Проверьте:
        //равны ли переменные,
        //не равны ли они,
        //больше ли a, чем b,
        //и меньше ли b, чем a.
        //Выведите результат на экран.

        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(101);
        int newB = random.nextInt(51)-20;
        System.out.println("a= " + a + ", b= " + b + ", newB= " + newB);


        boolean number = a == b;
        System.out.println("a = b: " + number);
        boolean number1 = a == newB;
        System.out.println("a = newB: " + number1);

        boolean number2 = a != b;
        System.out.println("a не равно b: " + number2);
        boolean number3 = a != newB;
        System.out.println("а не равно newB: " + number3);

        boolean number4 = a > b;
        System.out.println("a > b: " + number4);
        boolean number5 = a > newB;
        System.out.println("a > newB: " + number5);

        boolean number6 = b < a;
        System.out.println("b < a: " + number6);
        boolean number7 = newB < a;
        System.out.println("newB < a: " + number7);


    }
}
