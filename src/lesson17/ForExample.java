package lesson17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        int j =0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();


        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\n==================\n");

        // for ( ; ; ){
        //    System.out.print("Hello World");
        // }

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 100000){
            System.out.println(i1 + ", ");
        }
        System.out.println();
        System.out.println("Состояние переменной i1: " + i1);

        System.out.println("\n=====================\n");

        for (String str = "Hello"; str.length() < 10; str += "$"){
            System.out.println(str);
        }
        System.out.println("\n==========================\n");


        //Создать массив целых чисел произвольной длины от 5 до 15.
        // Заполнить массив случайными значениями от -50 до 50.
        //Вывести на экран:
        //Минимальное значение в массиве
        //Максимальное значение в массиве
        //Среднее арифметическое всех значений в массиве

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        for (int i = 0; i < ints.length; i++){
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + ", ");
        }
        System.out.print("]");

        //найти минимальное значени и вывести в консоль
        System.out.println("\n===================\n");

        int min = ints[0];
        for (int i = 0;i < ints.length; i++){
            if (ints[i] < min) min = ints[i];
        }
        System.out.print(min + ", ");

        for ( int i = 0;i < 7;i++){
            if (i == 3) continue;
            System.out.print(i + ", ");
        }
        System.out.println();

        for ( int i = 0;i < 7;i++){
            if (i == 3) break;
            System.out.print(i + ", ");
        }
        System.out.println();














    }
}
