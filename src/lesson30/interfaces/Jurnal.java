package lesson30.interfaces;

public class Jurnal implements Printable{
    String name;
    int number;

    public Jurnal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.printf("Jurnal %s #%d\n",name, number);
    }
}
