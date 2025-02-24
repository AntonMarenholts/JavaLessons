package lesson15;


import java.util.Random;

public class HomeWork_1 {
    public static void main(String[] args) {
        //Запишите в 4 переменные случайные числа от 0 до 100.
        //Выведите все 4 числа на экран.
        //Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
        //Output:
        //Максимальное число: 33

        Random random = new Random();

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);
        System.out.printf("a = %d, b = %d,c = %d, d = %d", a, b, c, d);
        System.out.println("\n====================\n");
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        System.out.println("Output: " + max);



    }
}
