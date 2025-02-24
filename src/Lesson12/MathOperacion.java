package Lesson12;

public class MathOperacion {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;
         result = 15 + 16;
         System.out.println("результат: " + result);

        result = var2 + var1;
        System.out.println("результат - " + result);

        result = var1 % var2;
        System.out.println(result);

        double doubleVar = 20.0;
        double doubleVar2 = 7.0;

        double doubleRes = doubleVar / doubleVar2;
        System.out.println("doubleRes = " + doubleRes);
    }
}
