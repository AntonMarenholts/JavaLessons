package lesson34;

import hw24.Calculator;
import lesson27.Autobus;
import lesson27.BusDriver;
import lesson33.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    //@BeforeEach "Метод,который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp(){
        System.out.println("BeforeEach");

    }
    /*
    @BeforeAll - метод выполняется один раз перед выполнением первого тестового метода.
    @AfterEach - выполняется после КАЖДОГО тестового метода
    @AfterAll - выполняется один раз,после выполнения всех тестовых методов
    @Disabled - указывает, что тест отключён и выполняться не будет
     */

    //@Test указывает,что метод является тестовым
    // Таким образом junit знает,что этот метод нужно запустить во время выполнения тестов
    @Disabled
    @Test
    public void testEdition(){
        System.out.println("Test addition");
        // Протестировать,правильно ли работает метод add класса Calculator
        int result = Calculator.add(2,3);

        // Реальное / фактическое значение в переменной result
        // Ожидаемое значение 5

        // Методы проверки утверждений
        // asserrtionsEquals(expected, result);
        assertEquals(5, result);// Проверяет равны ли 2 значения. Тест будет пройден,если 2 значения равны
        assertNotEquals(0, result);// Тест будет пройден,если фактический результат не совпадёт с неверным результатом
        assertTrue( result >= 5);// ПРоверяет,что условие верно (true)
        assertEquals(10, 5 + 5); //  статический импорт позволяет использовать методы, без обращения к классу
        assertFalse(result > 10);// Проверяет,чтоусловие ложное (false)
        assertNull(null);// Тест будет пройден,если объект будет равен NULL
        assertNotNull("String");// Проверяет,что объект НЕ равен NULL



    }


    @Test
    public void emptyTest(){
        System.out.println("Test Empty");
        // Тест пройден, если нет ни одного не верного утверждения
        // В том числе пустой (вообще без утверждений) считается пройденным.

    }
    // Параметризованные тесты
    @ParameterizedTest
    @ValueSource(strings = {"Apple", "Banana", "Kiwi", "Cherry"})
    public void testFruits(String fruit){
        System.out.println("current value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() >= 4);
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2})
    void testStatic(int value){
        System.out.println("static value run: " + value);
        Autobus bus = new Autobus(new BusDriver("Test", "11111"), 10);
        System.out.println(bus);

    }

    // Источник данных в формате CSV -
    // Источник данных файл в формате CSV -

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMetodFruits(String fruit){
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);

    }
    static Stream<String>testDataFruits(){
        return Stream.of("Apple", "Banana", "Kiwi", "Cherry");

    }
    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMetodSourceInt(int value){
        System.out.println("Current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt(){
        return Stream.of(1,2,-10,0,15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMetodSourceArguments(int value, int expected, boolean isEquals){
        System.out.println(value + " | " + isEquals + " | " + expected);
        int result = value * value;
        assertEquals(expected, result);
    }
    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2,4,true),
                Arguments.of(3,9,true),
                Arguments.of(4,16,false)

        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person, String newEmail){
        System.out.println("Current value: " + person);
        System.out.println("New email: " + newEmail);
    }

    static Stream<Arguments> testPersonData(){
        Person person = new Person("dfj.com", "klasjnfQW12$");
        return Stream.of(
                Arguments.of(person,"new123$mail.com"),
                Arguments.of(new Person("invalid.mail.com", "jkashf%12H"),"pass.com")
        );
    }


  
}