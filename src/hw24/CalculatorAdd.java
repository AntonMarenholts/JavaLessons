package hw24;

import java.util.Scanner;

public class CalculatorAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Сложение: " + Calculator.add(a, b));
        System.out.println("Вычитание: " + Calculator.subtract((int) a, (int) b));
        System.out.println("Умножение: " + Calculator.multiply((int) a, (int) b));
        System.out.println("Деление: " + Calculator.divide(a, b));

    }
}
