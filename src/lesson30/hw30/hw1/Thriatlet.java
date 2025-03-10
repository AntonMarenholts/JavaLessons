package lesson30.hw30.hw1;

public class Thriatlet implements Swimmer, Runner {

    int swimming;
    int runner;

    public Thriatlet(int swimming, int runner) {
        this.swimming = swimming;
        this.runner = runner;
    }

    @Override
    public String toString() {
        return "Thriatlet{" +
                "swimming=" + swimming +
                ", runner=" + runner +
                '}';
    }

    @Override
    public void run() {
        System.out.printf("Атлет пробежал: %d км", runner);
    }

    @Override
    public void swimm() {
        System.out.printf("Атлет проплыл: %d метров", swimming);


    }

}
