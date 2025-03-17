package lesson34.hw34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUP() {
        person = new Person(startEmail, startPassword);
    }

     /*
    1. Беру валидный email
    2. Устанавливаем его сеттером person-у
    3. Мы ожидаем: что у person в поле email будет значение, которое мы установили в шаге 2
     */

    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de", })
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());

    }

}