package hw25;


public class hw2 {
    public static void main(String[] args) {
        System.out.println(MAX_USERS);
    }
    /*
    •	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
    */

    public static final int MAX_USERS = 100;
//    MAX_USERS = 200;
}

// final означает,что переменная может быть инициализированна только один раз.
// После этого её значение не может быть изменено.
// Ошибка компиляции

