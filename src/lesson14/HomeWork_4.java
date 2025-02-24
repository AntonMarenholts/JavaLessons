package lesson14;

public class HomeWork_4 {
    public static void main(String[] args) {

        //Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.
        //Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.

        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);














    }
}
