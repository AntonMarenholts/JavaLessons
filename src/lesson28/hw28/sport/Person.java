package lesson28.hw28.sport;

// Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
//У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
//Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
//В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам

public class Person {

    protected int speed = 10;
    protected int restTime = 15;

    public void run(){
        System.out.printf("Бегу со скоростью %d км/ч. ", speed);
        rest();
    }

    protected void rest(){
        System.out.printf("Отдыхаю %d минут", restTime);
    }



    public Person(int speed, int restTime) {
        this.speed = speed;
        this.restTime = restTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}
