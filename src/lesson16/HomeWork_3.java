package lesson16;

import java.util.Random;

public class HomeWork_3 {
    public static void main(String[] args) {
        //Создать массив целых чисел произвольной длины от 5 до 15.
        // Заполнить массив случайными значениями от -50 до 50.
        //Вывести на экран:
        //Минимальное значение в массиве, максимальное значение, среднее арифметическое всех значений.

        Random random = new Random();
        int [] number = new int[10];
        int a = 0;
        while (a < number.length) {
            number[a] = random.nextInt(101) - 50;
            System.out.print(number[a] + ", ");
            a++;
        }
        System.out.println();

        //минимальное значение в массиве
        int min = number[0];
        a = 1;
        while (a < number.length){
            if (number[a] < min) min = number[a];
            a++;
        }
        System.out.println("Минимальное значение: " + min);

        //максимальное значение в массиве
        int max = number[0];
        a = 1;
        while (a > number.length){
            if (number[a] > max) max = number[a];
            a++;
        }
        System.out.println("Максимальное значение:" + max);

        // среднее арифметическое
        int sum = 0;
        a = 0;
        while (a < number.length){
            sum += number[a];
            a++;
        }
        double avarage = (double) sum / number.length;
        System.out.println("Среднее арифметическое: " + avarage);


    }
}
