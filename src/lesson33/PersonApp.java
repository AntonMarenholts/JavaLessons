package lesson33;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("test@mail.net", "password");

        System.out.println(person);

        person.setEmail("test@mailne.t");
        System.out.println(person);
    }

}
