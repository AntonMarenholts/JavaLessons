package lesson32.hw32.hw2;

/*
Создайте обобщенный класс NumericPair, который хранит две числовые
переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */

public class NumericPair <T extends Number, E extends Number> {
    private T num1;
    private E num2;

    public NumericPair(T num1, E num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum(){
        return num1.doubleValue() + num2.doubleValue();
    }
}
