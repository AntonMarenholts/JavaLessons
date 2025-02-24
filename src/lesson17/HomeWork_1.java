package lesson17;

public class HomeWork_1 {
    public static void main(String[] args) {
        //Написать метод, принимающий на вход строку.
        // Метод должен вывести на экран число, соответсвующее количеству символов в строке.
        //Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)

        String myStrings = "Клавдий Волобуев";

        stringNumber(myStrings);



    }
    public static void stringNumber(String str){

        int length = 0;
        for (int a = 0;a < str.length();a++){
            length++;
        }
        System.out.print("Length of the string: " + "(" + str + ")" + " is: " + length );
    }

}
