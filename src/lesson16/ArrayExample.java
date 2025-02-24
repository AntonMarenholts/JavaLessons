package lesson16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array;
        String[] strings;

        array = new int[4];
        strings = new  String[10];

        int[] array2 = new int[8];

        boolean[] bools = new  boolean[3];

        int value = array2[0];
        System.out.println("array2[0]: " + value);
        System.out.println("array2[7]: " + array2[7]);
        System.out.println("bools[1]: " + bools[1]);
        System.out.println("strings[9]: " + strings[9]);

        int[]numbers = new int[]{45, -16, 0, 159};
        // или
        int[] ints = {-10, 54, 1024, 444};

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100;

        int len = numbers.length;
        System.out.println("numbers.length: " + len);


        System.out.println("Вывести все значения массива");
        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i] + ", ");
            i++;
        }
        System.out.println();


        System.out.println("\n=========================\n");

        //Создать массив на 10 элементов и заполнить его случайными числами от 0 до 100 вкл.

        Random random = new Random();
        int [] num = new int[10];
        i = 0;
        System.out.println("[");
        while (i < num.length) {
            num[i] = random.nextInt(101);
            System.out.println(num[i] + ", ");
            i++;
        }
        System.out.println("]");



    }
}
