package HomeWork21;

public class Driver {
    String name;
    int numerBus;
    int solar;
    int laps;

    public Driver(String name, int numerBus, int solar){
        this.name = name;
        this.numerBus = numerBus;
        this.solar = solar;
        this.laps = 0;
    }
    public void info() {
        System.out.printf("Меня зовут %s, я водитель автобуса номер %d и я зарабатываю %d за круг",name, numerBus, solar);
        System.out.println();
    }

    public void lap(){
        System.out.println("Я в пути!");
        this.solar +=100;
        this.laps++;

        if (this.laps >= 4) {
            System.out.println("Я устал,с меня хватит!");
        }
    }
}
