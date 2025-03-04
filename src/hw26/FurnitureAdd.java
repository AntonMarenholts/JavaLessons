package hw26;

public class FurnitureAdd {

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen("klassic ", "Kleo", "red", 2000);
        System.out.println(kitchen);
        System.out.println("Цвет: " + kitchen.getColor());
        System.out.println("Модель: " + kitchen.getModel());

        System.out.println("\n========= OFFICE =========\n");

        Office office = new Office("Baroko", "Standart", "wood", "1");
        System.out.println("Style: " + office.getStyle());
        System.out.println("Material: " + office.getMaterial());
        System.out.println("Klass: " + office.getKlass());





    }
}
