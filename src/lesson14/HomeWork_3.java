package lesson14;

import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {

        //Попросите пользователя ввести целое число с клавиатуры.
        //Ваша программа должна вывести строку в формате:
        //Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        //Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
        //Copy
        //Проверьте работу вашей программы, вводя разные числа.
        // Убедитесь в правильности выдаваемой строки.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int nummer = scanner.nextInt();

        boolean even = nummer % 2 == 0;
        boolean multiple3 = nummer % 3 == 0;
        boolean evenMultiple3 = even && multiple3;

        System.out.println("Число: " + nummer + " четное: " + even + "; кратно 3: " + multiple3 + "; четное и кратное 3: " + evenMultiple3);
    }
}
