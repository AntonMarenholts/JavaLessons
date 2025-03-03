package hw25;

import hw24.Calculator;

import java.util.Scanner;

public class hw1CalculatorAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Введите радиус: ");
        double radius = scanner.nextDouble();

        System.out.println("Сложение: " + hw1Calculator.addition(a, b));
        System.out.println("Вычитание: " + hw1Calculator.subtract(a,b));
        System.out.println("Умножение: " + hw1Calculator.multiply(a, b));
        System.out.println("Деление: " + hw1Calculator.divide(a, b));
        System.out.println("Длинна окружности: " + hw1Calculator.Circumference(radius));
        System.out.print("Площадь круга: " + hw1Calculator.CircleArea(radius));

    }
}
