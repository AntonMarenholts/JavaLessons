package lesson28.animals;

public class ZooApp {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice();//Унаследован от Animal
        System.out.println(cat.toString());
        cat.eat();

        System.out.println("\n==============\n");

        Dog dog = new Dog();
        dog.voice();//Если в потоке не переопределяется метод
        // будет вызвана реализация метода родителя
        System.out.println(dog.toString());

        System.out.println("\n==============\n");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("\n===============\n");

        Object object = new Object();


    }
}
