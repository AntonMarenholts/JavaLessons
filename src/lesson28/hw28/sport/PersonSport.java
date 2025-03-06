package lesson28.hw28.sport;

public class PersonSport {
    public static void main(String[] args) {
        Person person = new Person(10,15);
        AmatorAtlet amatorAtlet = new AmatorAtlet();
        ProfessionalAtlet professionalAtlet = new ProfessionalAtlet();

        System.out.println("Обычный человек: ");
        person.run();
        System.out.println();

        System.out.println("Спортсмен-любитель: ");
        amatorAtlet.run();
        System.out.println();

        System.out.println("Спортсмен-профи: ");
        professionalAtlet.run();




    }
}
