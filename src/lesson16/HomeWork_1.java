package lesson16;

public class HomeWork_1 {
    public static void main(String[] args) {

        //Найдите произведение всех чисел от 1 до 15 включительно.
        //
        //Результат выведите на экран
        int number = 1;
        int multi = 1;
        while (number <= 15){
            multi *= number;
            number++;
        }
        System.out.println(multi);

        System.out.println("\n========================\n");

        int number1 = 1;
        int multi1 = 1;
        while (number1 <= 15){
            multi1 += number1;
            number1++;
        }
        System.out.println(multi1);



    }
}
