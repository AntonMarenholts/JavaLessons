package lesson30.interfaces;

public class Presentation implements ColorPrintable{

    String title;
    String author;
    String theme;

    public Presentation(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Печатаю презентацию в цвете: автор %s, title %s, theme %s");
    }

    @Override
    public void print() {

    }
}
