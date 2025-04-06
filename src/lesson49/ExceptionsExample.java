package lesson49;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionsExample {
    public static void main(String[] args) throws MalformedURLException {

        // Ошибки компиляции
//        int a = "Java";
//        int x = 10

        // Ошибки времени выполнения Runtime

        // Exception (исключение) - представляют собой события,которые могут возникнуть именно во время выполнения программы
        // и нарушить её нормальное выполнение

        // Исключения в Java являются объектом определённого класса,который наследуется от класса Throwable()

        // Обработка ошибок - предусмотреть возможность появления Exception (объекта определённого класса)
        // и написать какой-то код,который будет выполнен в этом случае

        /*
        try-catch

        try{
             // код,который может вызвать исключение.

        } catch (ExceptionType) {
            // код для обработки исключения
            // код, который будет выполнен при возникновении объекта определённого класса
        } catch (Anothe) {

            // код обработки другого типа ошибки
        } finally {
            // код,который будет выполнен в любом случае,перед выходом из конструкции
        }



         */

        int[] array = {1,2,3,4};
////        array[10] = 100; // java.lang.ArrayIndexOutOfBoundsException
//
//        int x = 10 / 0; // java.lang.ArithmeticException

        try {
            array[2] = 10;
            System.out.println("Try continue");
            array[10] = 100;
            System.out.println("Try continue2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayException: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка");
            ex.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("Продолжение работы программы");

        System.err.println("Печатаю в потоке ошибок");

//        catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Что-то не так с индексом: " + exception.getMessage());
//        }

        System.out.println("=========================\n");

        // Проверяемые (checked exception) и непроверяемые исключения

//         Проверяемые (checked exception) - это тип исключения,наличие которых вы обязаны проверить и обработать.
//         Непроверяемые - это исключения, появление которых я не обязан обрабатывать в коде

        String result = getUrlString();
        System.out.println("result: " + result);

        System.out.println("=======================\n");
        String result2;
        try {
            result2 = getUrlString2();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    private static String getUrlString(){
        URL myUrl = null;

        // бросает проверяемое исключение

        try {
            myUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL: " + e.getMessage());
            return "https://google.com";
        }

        return myUrl.toString();
    }

    // Ключевое слово throws используется в сигнатуре метода для указания,что метод может выбросить исключение

    private static String getUrlString2() throws MalformedURLException{
        URL myUrl = new URL("http://example.com");
        return myUrl.toString();
    }


}
