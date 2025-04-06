package lesson49.validator;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("john@gmail.com", "qwerty");

        System.out.println(person);

        System.out.println("================\n");

        Person person1 = new Person("john.gmail.com", "qwerty");


    }
}
