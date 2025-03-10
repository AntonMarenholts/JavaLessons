package lesson30.flyable;

//Множественная реализация интерфейсов
public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swimm() {
        System.out.println("Duck swimming");

    }
}

// Class B extends A, A extends C; != class B extends A,C;
