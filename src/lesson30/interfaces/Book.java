package lesson30.interfaces;

// Если класс имплементирует интерфес, класс обязан реализовать все абстрактные методы интерфеса
public class Book implements Printable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public void print(){
        System.out.printf("Книга %s (%s)", title, author);

    }


}
