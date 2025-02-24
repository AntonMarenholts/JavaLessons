package lesson16;

public class HomeWork_4 {
    public static void main(String[] args) {
        //Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
        //Пример: { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }

        int[] number = {2, 34, -98, 23, 44};

        int max = 0;
        int b = 1;
        while (b < number.length){
            if (number[b] > number[max]) max = b;
            b++;
        }
        int min = 0;
        b = 1;
        while (b < number.length){
            if (number[b] < number[min]) min = b;
            b++;
        }
        int temp = number[max];
        number[max] = number[min];
        number[min] = temp;

        b = 0;
        while (b < number.length){
            System.out.print(number[b] + " ");
            b++;
        }




    }
}
