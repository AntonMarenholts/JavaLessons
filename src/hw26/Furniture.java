package hw26;

public class Furniture {

    private String style;
    private String model;

    public Furniture(String style, String model) {
        this.style = style;
        this.model = model;
    }

    public String toString(){
        return "Стиль мебели: " + style + "Модель: " + model;
    }
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
