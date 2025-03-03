package lesson25;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new  String[3];

    private String title;
    private int capacity = 10; //Инициализация значения

    //Статический блок инициализации
    //В нём могут быть проинициализированны статистические поля класса (присвоение начальных значений)
    // Вызывается ровно одтн раз в момент загрузки класса в JVM (до вызова конструктора)
    static {
        System.out.println("Static Block Run");
        colors[0] = "Red";
        colors[1] = "yellow";
        colors[2] = "green";

    }

    // НЕ статические блоки инициализации
    // Выполняются при каждом создании объекта
    // Вызываются до конструктора
    {
        System.out.println("Non static - block RUN");
        this.title = "Default";
    }

    public StaticBlockDemo() {
        System.out.println("Construktor RUN");
        if (counter == 0) {
            this.capacity = 50;
        }
//        colors[0] = "Red";
//        colors[1] = "yellow";
//        colors[2] = "green";

    }

    // Конструктор 2
    public StaticBlockDemo(String title) {
        System.out.println("Construktor 2 RUN");
//        if (counter == 0){
//            this.capacity = 50;
//        }
        this.title = title;
    }

    public String toString(){
        return String.format("Title: %s, capacity: %d, static-caunter: %d",title,capacity,counter);
    }
}
