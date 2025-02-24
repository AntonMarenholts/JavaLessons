package Lesson12;

public class HomeWork1 {
    public static void main(String[] args) {

        //Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
        //Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4.
        //Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        //Выведите на экран значение переменной.
        //Сколько программа отбросила в остаток при операции деления?

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int arithmeticMean = (a + b + c +d) / 4;
        System.out.println("Result = " + arithmeticMean);
        int result = arithmeticMean % 4;
        System.out.println(" Остаток от деления: " + result);


    }
}
