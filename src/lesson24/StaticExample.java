package lesson24;

public class StaticExample {

    //non-static класса
    int x;

    // static поле класса
    static int staticY;

    // Статический метод

    public static void staticMetod(){
        //Статические методы видят ТОЛЬКО статические члены (поля и методы) класса:
        // х++; нет доступа к не-статическому полю
        staticY++;
    }

    //НЕ-статический метод
    public void nonStaticMetod(){
        //У нестатического метода есть доступ КО ВСЕМ членам класса?
        x++; // не статика доступна
        staticY++; // статика тоже доступна
        // Можем вызывать статические и не статические методы
        staticMetod();

    }

    // Метод main статический
    public static void main(String[] args) {

        // x = 10; // Ошибка кампиляции. У статик метода нет доступа к НЕ-статик переменной
        staticY = 10;
        System.out.println(staticY);
        // nonStaticMetod(); не могу вызвать не- статический метод без создания объекта
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMetod(); // я могу вызвать не-статик метод только используя ссылку на объект

        // Я могу вызвать статический метод БЕЗ создания объекта
        StaticExample.staticMetod();


    }
}
