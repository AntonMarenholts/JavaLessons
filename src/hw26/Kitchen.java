package hw26;

public class Kitchen extends Furniture {

        private String color;
        private int size;

    public Kitchen(String style, String model, String color, int size) {
        super(style, model);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
