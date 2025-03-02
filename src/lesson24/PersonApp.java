package lesson24;

public class PersonApp {
    public static void main(String[] args) {
        Person garry = new Person("Garry", 22, "futbol");
        garry.toString();
        System.out.println(garry.toString());
        garry.setAge(46);
        System.out.println(garry.toString());

        Person John = new Person("John", 75, "Music");
        John.toString();
        System.out.println(John.toString());

        Person[] people = new Person[5]; //Создать массив для 5 на объекты типа Person
        // Значение по умолчанию для всех типов данных - null

        people[0] = garry;
        people[3] = John;
        people[1] = new Person("Tom", 24,"tanzen");

        System.out.println("\n===================\n");

        System.out.println(people[0].toString());
        System.out.println(people[0].getName());
        System.out.println(people[0].getHobby());
        people[0].setName("Vasy");
        System.out.println(people[0].toString());

        System.out.println("\n=================== For ============\n");

        for (int i = 0; i < people.length; i++){
            if (people[i] != null){
            System.out.println(people[i].toString());
            System.out.println(people[i].getName());

            } else {
                System.out.println("null!");
            }
        }

        System.out.println("\n=================== For ============\n");

        Person test = new Person("Kikimorovich", 194,"trinken");
        people[2] = test;

        people[2].setName("Test1");
        test.setAge(52);
        System.out.println(test.toString());

        // name? age? hobby?

        test = null;
        System.out.println(people[2].getHobby());




    }
}
