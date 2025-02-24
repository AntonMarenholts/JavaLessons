package lesson17;

public class HomeWork_3 {
    public static void main(String[] args) {
        //Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
        //Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
        //класс Math для нахождения степени числа использовать нельзя ;)
        //P.S. А почему вы решили, что число может прийти только положительное? ;)

        int number = 3;
        int result = calculateTwo(number);
        System.out.println("2 в степени " + number + " = " + result);

    }
    public static int calculateTwo(int number){
        int result = 1;
        if (number >= 0) {
            for (int i = 0; i < number; i++) {
                result *= 2;
            }
        } else {
            for (int i = 0;i > number;i--){
                result /= 2;
            }
        }
        return result;
    }
}
