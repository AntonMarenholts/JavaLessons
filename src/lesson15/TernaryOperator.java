package lesson15;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();


        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println(result);

        int x = 10;
        System.out.println((x >= 0) ? "Положительное" : "Отрицательное");


    }
}
