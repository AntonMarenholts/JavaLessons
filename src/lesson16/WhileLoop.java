package lesson16;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //вывести на экран цифры от 1 до 5 включительно
        int number = 1;
        while (number <= 5) {
            System.out.print(number + ", ");
            number++;


        }
        System.out.println();

        int number1 = 100;
        while ( number1 >= 90) {
            System.out.print(number1 + ", ");
            number1--;
        }
        System.out.println();

        int number2 = 1;
        int sum = 0;
        while (number2 <= 100) {
            sum += number2;
            number2++;

        }
        System.out.print(sum);

        System.out.println();

        int i = 1;
        while (i <= 21){
            if (i %2 == 0){
                System.out.print(i++ + ", ");
            }
            i++;

        }
        System.out.println();

        String str = " Распечатать каждый символ";
        int a = 0;
        while (a < str.length()){
            char c = str.charAt(a);
            System.out.println(c);
            a++;
        }
        System.out.println();

        System.out.println("\n==========================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число: ");
        int input = scanner.nextInt();

        while (input <= 0) {
            System.out.println("Введите положительно число");
            input = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Спасибо, вы ввели: " + input);


        int num = -1;

        do {
            System.out.println("Введите число больше 0: ");
            num = scanner.nextInt();
            scanner.nextLine();
        }while (num <= 0);
        System.out.println("Спасибо, вы ввели: " + num);









    }

}
