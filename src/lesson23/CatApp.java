package lesson23;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Katy", 5, 12);

        cat.sayMay();
        System.out.println(cat.toString());

        //cat.weight = 1500;
        //cat.name = "Vasy";
        System.out.println(cat.toString());

        int catAge = cat.getAge();
        System.out.println("В следующем году коту будет: " + (catAge + 1));
        System.out.println("Вес: " + cat.getWeight());
        System.out.println("Имя кота: " + cat.getName());

        cat.setAge(15);
        cat.setAge(-10);
        System.out.println(cat.toString());

        cat.setWeight(3);
        System.out.println(cat.toString());
        cat.setWeight(-10);
        System.out.println(cat.toString());

        cat.setName("Max");
        System.out.println(cat.toString());

        System.out.println("\n=====================\n");

        cat.isProtected = true;
        System.out.println("isProtected: " + cat.isProtected);




    }
}
