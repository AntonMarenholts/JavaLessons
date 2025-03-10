package lesson30.interfaces;

public class Aplication {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "Булгаков");

        book.print();

        System.out.println();

        Jurnal jurnal = new Jurnal("Cosmopolytan", 23);
        jurnal.print();

        // ТИп ссылки типа интерфейс.
        // Набор методов,доступных по ссылке - методы,которые прописаны в интерфейсе
        // Объект класса, который реализовал данный интерфейс
        Printable printable = jurnal;
        Printable printable1 = new Book("Философия Java", "Б.Эккель");
        printable1.print();

        System.out.println("\n=================\n");

        Printable.testStaticMethod("Hello");

        System.out.println("\n=======================\n");

        ColorPrintable presentation = new Presentation("Inheritanct","Noname", "Inheritance in OOP");

        presentation.print();
        presentation.defaultMetod();
        presentation.colorPrint();



    }
}
