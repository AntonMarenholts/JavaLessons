package hw26;

public class Office extends Furniture {

    String material;
    String klass;

    public Office(String style, String model, String material, String klass) {
        super(style, model);
        this.material = material;
        this.klass = klass;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }
}
