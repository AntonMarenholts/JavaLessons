package lesson46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(10,"Peter", 25));
        users.add(new User(5,"Max", 18));
    }

    public static void main(String[] args) {

        // Optional<T> это класс-обёртка,который может содержать значение типа Т,а может не содержать (быть пустым)

        // Основная задача - уменьшить кол-во ошибок,козникающих при обращении к null

        Optional<User> optUser = getById2(10);

//        System.out.println(optUser.get());



        // boolean .isPresent() - Мы можем проверить,есть ли в обёртке значение
        if (optUser.isPresent()){
            // Метод get() - позволяет получить значение ,завёрнутое в Optional
            // если вызвать его на пустом (содержащим null) - получим NPE (ошибку)
            User user = optUser.get();
            System.out.println("user: " + user);
            System.out.println("Имя: " + user.getName());
        } else {
            System.out.println("Пользователь не найден");
        }

        // boolean isEmpty - возвращает true, если Optional пустой

        // orElse(T defaultValue) - распакует из Optional объект если он есть или вернёт значение по умолчанию

        User current = getById(1).orElse(null);
        System.out.println("getById(1).orElse(null): " + current);

//        System.out.println(user.getName());


    }

    /*
    Кака создать Optional
    Optional.of(value) - создаёт Optional, содержащий значение. (не пустой)
    Если передать null - будет ошибка

    Optional.empty() - создаёт пустой Optional

    Optional.ofNullLable(value) - создаёт Optional, который содержит значение или пустой
     */

    // Обёртка указывает на необходимость проверки на null
    public static Optional<User> getById(int id){
        //Список пользователей
        //Перебираем пользователей, сравниваем id
        for (User user : users){
            if (user.getId() == id){
                return Optional.of(user);
            }
        }

        // TODO
        return Optional.empty();
    }
    public static Optional<User> getById2(int id){
        //Список пользователей
        //Перебираем пользователей, сравниваем id
        User result = null;

        for (User user : users){
            if (user.getId() == id){
                result = user;
            }
        }

        // TODO
        return Optional.ofNullable(result);
    }



}
