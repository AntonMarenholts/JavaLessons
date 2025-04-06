package lesson49.validator;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("john@gmail.com", "qwerty");

        System.out.println(person);

        System.out.println("================\n");

        // Проверка пароля
        person.setPassword("short");
        System.out.println(person);

        System.out.println("================\n");

        person.setPassword("Password123!");
        System.out.println(person);

        Person person1 = new Person("john@gmail.com","qwerty");
        person1.setPassword("dsgdgdg");
        System.out.println(person1);

    }
}









