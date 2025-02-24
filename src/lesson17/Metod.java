package lesson17;

public class Metod {
    public static void main(String[] args) {
        sayHello();
        sayHello();

        char ch = 'A';

        printDecimalCodeOfChar(ch);
        char anotherChar = 'B';
        printDecimalCodeOfChar(anotherChar);

        int[] array = {1, 45, 78, 20, 23, 91};
        printArray(array);
        int[] array2 = {9,2,4,5,7,88,123};
        printArray(array2);

        array[3] = 100;
        array[2] = -100000;
        printArray(array);

        String[] strings = {"Hello", "Java", "World"};
        printArray(strings);

        testParaneterOrder(2, "Hello");
        testParaneterOrder("Java", 4);


    } // Metod area (место написания методов)

    /*
    В пределах одного класса может быть два и более методов с одинаковым именем
    но разным набором параметров (тип и порядок параметров имеет значение)
     */

    public static void testParaneterOrder(int x, String str) {
        System.out.println("INT + STRING: " + x + " | " + str);
    }

    public static void testParaneterOrder(String string, int y) {
        System.out.println("INT + STRING: " + string + " | " + y);
    }



    //метод выводящий все элементы массива строк
    public static void printArray(String[] strings) {
        System.out.println("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i == strings.length - 1 ? ", " : "]\n"));
        }

    }
     // метод выводящий все элементы массива целых цисел
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

    public static void printDecimalCodeOfChar(char ch1) {
        // char ch1 = ch (из аргумента вызова) - условно выполняемая строка при вызове метода (перед началом работы метода)
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        //тело метода
        System.out.println("Hello World");
    }

}//end
