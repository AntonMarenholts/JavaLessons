package lesson28.staticPolymjrf;

public class MathOperation {

    /*
    В Java полиморфизм проявляется в двух формах

    Статический (компиляционный) полиморфизм-реализуется с помощью перегрузки методов (Metod OverLoading)

    Динамический (исполнительный) полиморфизм - реализутся через переопределение методов (Method Overriding)
     */
    static int sum(int a, int b){
        return a + b;
    }
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,2));
    }





}
