package lesson21;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void info(){
        System.out.printf("Я собака %s b и мой вес %d", name,weight);
    }

    public void eat(){
        System.out.println("Я кушаю,ням-ням!");
        this.weight++; //увеличиваем вес на 1
    }

    public void run(){
        // достаточные ли вес у собаки
        // усли вес собаки слишком мал - собака должна поесть

        while (weight < 3){
            System.out.println("Сорян,я должна покушать! Я бегать не могу!");
            System.out.println("Мой вес сейчас : " + weight);

            eat();

        }
        System.out.println("Я бегу!");
        this.weight -=2;
        System.out.println("Вес после пробежки: " + weight);//уменьшаем вес на 2

    }
}
