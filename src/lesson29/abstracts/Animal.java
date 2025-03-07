package lesson29.abstracts;

public abstract class Animal {

    //абстрактный метод не имеет реализации
    abstract void move();
    abstract void eat();

    //
    public void sayHallo(){
        System.out.println("Hello from animal");
    }

}
