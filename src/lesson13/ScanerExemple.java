package lesson13;

import java.util.Scanner;

public class ScanerExemple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Привет," + name);

        System.out.println("Введите свой возраст:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Age: " + age);

        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        System.out.println("City: " + city);

        System.out.println("Введите число Pi: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi: " + pi);






    }
}
