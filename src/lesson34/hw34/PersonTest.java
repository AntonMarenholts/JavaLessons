package lesson34.hw34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PersonTest {

    Person person;
    String startEmail = "jphn@tast.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail,startPassword);

    }

    /*
    1. Беру валидный(правильный) email
    2. Устанавливаем его сеттером person-y
    3. Мы ожидаем: что у person в поле email будет значение,которое мы установили в шаге 2

     */

    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de"})
    void testValidEmailSet(String validEmail){

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берём НЕ валидный email
    2. Устанавливаем его сеттером
    3. Ожидаемый результат: email установлен не будет
       3.1 поле email у person НЕ будет равно "не валидный email"
       3.2 значение у поля email должно остаться прежним
     */
//    @ParameterizedTest
//    @MethodSource("invalidEmailDAta")
//    void testInvalidEmailSet(String invalidEmail){
//        person.setEmail(invalidEmail);
//        Assertions.assertNotEquals(invalidEmail,person.getEmail());
//        Assertions.assertEquals(startEmail,person.getEmail());
//    }
//    static Stream<String> invalidEmailDAta(){
//        return Stream.of(
//                "test@mail.com",
//                "test@@mail.com",
//                "test//@emai.com"
//        );
//    }




}
